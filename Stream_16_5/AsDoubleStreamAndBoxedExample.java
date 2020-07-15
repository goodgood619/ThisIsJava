package thisIsJava.Stream_16_5;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AsDoubleStreamAndBoxedExample {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};
        IntStream intStream = Arrays.stream(intArray);
        intStream.asDoubleStream()
                .forEach(n -> System.out.println(n));

        System.out.println();

        intStream = Arrays.stream(intArray);
        intStream.boxed()
                .forEach(n -> System.out.println(n.intValue()));
    }
}
