package thisIsJava.Stream_16_7;

import java.util.Arrays;

public class LoopingExample {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5, 4, 2};

        System.out.println("[peek()을 마지막에 호출한 경우]");
        Arrays.stream(intArr)
                .filter(n -> n % 2 == 0)
                .peek(n -> System.out.println(n)); // 동작하지 않음(peek() 메소드는 반드시 최종 처리 메소드가 호출되어야한다)
        // peek 이후에 최종 처리 메소드가 없기 때문에 peek은 결국 호출되지 않음

        System.out.println("[최종 처리 메소드를 마지막에 호출한 경우]");
        int total = Arrays.stream(intArr)
                .filter(n -> n % 2 == 0)
                .peek(n -> System.out.println(n))
                .sum();
        System.out.println("총합 : " + total);

        System.out.println("[forEach()를 마지막에 호출한 경우]");
        Arrays.stream(intArr)
                .filter(a -> a % 2 == 0)// Intpredicate : Int값이 매개변수고 나가는 값이 boolean값(특정 조건이 맞는지)
                .forEach(n -> System.out.println(n));

        System.out.println("[forEach()를 중간에 호출한 경우] -> 그 뒤에 메소드가 더이상 뜨질않음 ㅇㅇ");

    }
}
