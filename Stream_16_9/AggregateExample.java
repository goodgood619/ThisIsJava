package thisIsJava.Stream_16_9;

import java.util.Arrays;

public class AggregateExample {
    public static void main(String[] args) {
        long count = Arrays.stream(new int[]{1, 2, 3, 4, 5})
                .filter(n -> n % 2 == 0)
                .count();
        System.out.println("2의 배수 갯수: " + count);
        // count()메소드는 long 타입의 아웃풋으로 나옴

        int sum = Arrays.stream(new int[]{1, 2, 3, 4, 5})
                .filter(n -> n % 2 == 0)
                .sum();
        System.out.println("2의 배수의 합 : " + sum);

        double avg = Arrays.stream(new int[]{1, 2, 3, 4, 5})
                .filter(n -> n % 2 == 0)
                .average()
                .getAsDouble();

        System.out.println("2의 배수의 평균 : " + avg);


        int max = Arrays.stream(new int[]{1, 2, 3, 4, 5})
                .filter(n -> n % 2 == 0)
                .max()
                .getAsInt();
        System.out.println("2의 배수 중 최대값 : " + max);

        int min = Arrays.stream(new int[]{1, 2, 3, 4, 5})
                .filter(n -> n % 3 == 0)
                .min()
                .getAsInt();

        System.out.println("3의 배수중 최소값 : " + min);

        int first = Arrays.stream(new int[]{1, 2, 3, 4, 5})
                .filter(n -> n % 3 == 0)
                .findFirst()
                .getAsInt(); // isPresent() 메소드를 체크하라고 뜨는데, 말그대로 존재하는지 여부를 확인하고 getAs자료형()으로 값을 얻으라는 의미에서 경고표시를 띄움

        System.out.println("첫번째 3의 배수 : " + first);

    }
}
