package thisIsJava.Stream_16_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpressionsExample {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(new Student("둥이", 90), new Student("뚱", 100));
        Stream<Student> studentStream = list.stream();
        studentStream.forEach(s -> {
            String name = s.getName();
            int score = s.getScore();
            System.out.println(name + "-" + score);
        });

    }
}
