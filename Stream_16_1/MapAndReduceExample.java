package thisIsJava.Stream_16_1;

import java.util.Arrays;
import java.util.List;

public class MapAndReduceExample {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(new Student("둥이", 10)
                , new Student("둥둥", 20), new Student("뚱이", 40));
        double arg = studentList.stream().mapToInt(Student::getScore)
                .average().getAsDouble();
        System.out.println("평균 점수 : " + arg);
    }
}
