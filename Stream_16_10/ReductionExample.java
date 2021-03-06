package thisIsJava.Stream_16_10;

import java.util.Arrays;
import java.util.List;

public class ReductionExample {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("둥이", 92),
                new Student("뚱이", 94),
                new Student("둥둥", 80)
        );

        int sum1 = studentList.stream()
                .mapToInt(Student::getScore)
                .sum();
        int sum2 = studentList.stream()
                .map(Student::getScore)
                .reduce(Integer::sum)
                .get();

        int sum3 = studentList.stream()
                .map(Student::getScore)
                .reduce(0, Integer::sum);

        System.out.println("sum1: " + sum1);
        System.out.println("sum2: " + sum2);
        System.out.println("sum3: " + sum3);

    }
}
