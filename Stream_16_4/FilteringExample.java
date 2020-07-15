package thisIsJava.Stream_16_4;

import java.util.Arrays;
import java.util.List;

public class FilteringExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "둥이", "둥이", "둥2", "뚱이", "뚱이", "뚱2", "둥둥"
        );
        names.stream().distinct()
                .forEach(n -> System.out.println(n));

        System.out.println();

        names.stream()
                .filter(n -> n.startsWith("뚱"))
                .forEach(n -> System.out.println(n));

        System.out.println();
        names.stream()
                .distinct()
                .filter(n -> n.startsWith("둥"))
                .forEach(n -> System.out.println(n));
    }
}
