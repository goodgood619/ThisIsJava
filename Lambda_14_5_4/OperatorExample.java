package thisIsJava.Lambda_14_5_4;

import java.util.function.IntBinaryOperator;

public class OperatorExample {
    private static int[] scores = {92, 87, 95};

    private static int maxOrMin(IntBinaryOperator operator) {
        int result = scores[0];
        for (int score : scores) {
            result = operator.applyAsInt(result, score);
        }
        return result;
    }

    public static void main(String[] args) {
        int max = maxOrMin(
                (a, b) -> {
                    if (a >= b) return a;
                    else return b;
                }
        );

        System.out.println("최대값 : " + max);

        int min = maxOrMin((a, b) -> {
            if (a > b) return b;
            else return a;
        });
        System.out.println("최소값 : " + min);
    }
}
