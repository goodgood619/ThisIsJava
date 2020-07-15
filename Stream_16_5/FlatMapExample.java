package thisIsJava.Stream_16_5;

import java.util.Arrays;
import java.util.List;

public class FlatMapExample {
    public static void main(String[] args) {
        List<String> inputList = Arrays.asList(
                "java8 lambda", "stream mapping"
        );

        inputList.stream()
                .flatMap(data -> Arrays.stream(data.split(" ")))
                .forEach(n -> System.out.println(n));
        System.out.println();

        List<String> inputList2 = Arrays.asList(
                "10, 20, 30", "40, 50, 60"
        );
        inputList2.stream()
                .flatMapToInt(data -> {
                    String[] strArr = data.split(",");
                    int[] intArr = new int[strArr.length];
                    for (int i = 0; i < intArr.length; i++) {
                        intArr[i] = Integer.parseInt(strArr[i].trim());
                    }
                    return Arrays.stream(intArr);
                })
                .forEach(n -> System.out.println(n));
    }
}
