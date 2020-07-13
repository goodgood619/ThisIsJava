package thisIsJava.Stream_16_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("홍길동", "신용권", "둥이", "굿굿", "뱃뱃", "뚱");
        Stream<String> stream = list.stream();
        stream.forEach(ParallelExample::print);
        System.out.println();
        Stream<String> parallelStream = list.parallelStream();
        parallelStream.forEach(ParallelExample::print);
    }

    private static void print(String str) {
        System.out.println(str + " : " + Thread.currentThread().getName());
    }
}
