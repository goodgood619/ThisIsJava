package thisIsJava.Lambda_14_5_5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    private static List<Student> list = Arrays.asList(
            new Student("홍길동", "여자", 94),
            new Student("뚱이", "남자", 80),
            new Student("둥이", "여자", 98),
            new Student("뚱둥이", "남자", 89)
    );

    private static double arg(Predicate<Student> predicate) {
        int count = 0, sum = 0;
        for (Student student : list) {
            if (predicate.test(student)) {
                count++;
                sum += student.getScore();
            }
        }
        return (double) sum / count;
    }

    public static void main(String[] args) {
        double maleAvg = arg(t -> t.getSex().equals("남자"));
        System.out.println("남자 평균 점수 : " + maleAvg);

        double femaleAvg = arg(t -> t.getSex().equals("여자"));
        System.out.println("여자 평균 점수 : " + femaleAvg);
    }
}
