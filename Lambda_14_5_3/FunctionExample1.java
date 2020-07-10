package thisIsJava.Lambda_14_5_3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample1 {
    private static List<Student> list = Arrays.asList(new Student("홍길동", 90, 96),
            new Student("뚱이", 95, 93));

    public static void printString(Function<Student, String> function) {
        for (Student student : list) {
            System.out.println(function.apply(student) + " "); // Function 적용
        }
        System.out.println();
    }

    public static void printInt(ToIntFunction<Student> function) {
        for (Student student : list) {
            System.out.println(function.applyAsInt(student) + " "); // 적용
        }
        System.out.println();
    }

    private static double avg(ToIntFunction<Student> function) {
        int sum = 0;
        for(Student student : list) {
            sum += function.applyAsInt(student);
        }
        double arg = (double)sum / list.size();
        return arg;
    }
    public static void main(String[] args) {
        System.out.println("[학생 이름]");
        printString(t->t.getName()); //Function의 apply에 적용되는 명령

        System.out.println("[영어 점수]");
        printInt(t->t.getEnglishScore()); // 마찬가지

        System.out.println("[수학 점수]");
        printInt(t->t.getMathScore()); // 마찬가지

        System.out.println("영어 평균 점수 : "+avg(t->t.getEnglishScore()));
        System.out.println("수학 평균 점수 : "+avg(t->t.getMathScore()));
    }
}
