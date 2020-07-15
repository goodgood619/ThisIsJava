package thisIsJava.Stream_16_5;

import java.util.Arrays;
import java.util.List;

public class MapExample {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("둥이", 10)
                , new Student("뚱이", 20)
                , new Student("둥둥", 30)
        );

        studentList.stream()
                .mapToInt(Student::getScore) //getScore가 정적(static) method가 아닌데, Method reference가 대문자를 쓰네? 뭐징
                .forEach(score -> System.out.println(score));

    }
}
