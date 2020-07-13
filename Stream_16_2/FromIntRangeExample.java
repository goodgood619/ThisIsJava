package thisIsJava.Stream_16_2;

import java.util.stream.IntStream;

public class FromIntRangeExample {
    public static int sum = 0;

    public static void main(String[] args) {
        IntStream stream = IntStream.rangeClosed(1, 100);
        stream.forEach(a -> sum += a);
        System.out.println("총합 : " + sum);
    }
}
