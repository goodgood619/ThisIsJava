package thisIsJava.Stream_16_6;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class SortingExample {
    public static void main(String[] args) {
        IntStream intStream = Arrays.stream(new int[]{5, 3, 1, 2, 4, 10, -1});

        intStream.sorted()
                .forEach(n -> System.out.println());
        System.out.println();

        //객체 요소일 경우
        List<Student> studentList = Arrays.asList(
                new Student("둥이", 30)
                , new Student("뚱이", 10)
                , new Student("둥둥", 40)
        );

        System.out.println("오름차순");
        studentList.stream()
                .sorted()
                .forEach(n -> System.out.println(n.getScore()));

        System.out.println("내림차순");
        studentList.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(n -> System.out.println(n.getScore()));
    }
}
