package thisIsJava.Stream_16_2;

import java.util.Arrays;
import java.util.stream.Stream;

public class FromArrayExample {
    public static void main(String[] args) {
        String[] strArray = {"홍길동","뚱이","둥이"};
        Stream<String> stream = Arrays.stream(strArray);
        stream.forEach(a->System.out.println(a+","));
    }
}
