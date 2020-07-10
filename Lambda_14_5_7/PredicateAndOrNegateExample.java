package thisIsJava.Lambda_14_5_7;

import java.util.function.IntPredicate;

public class PredicateAndOrNegateExample {
    public static void main(String[] args) {

        IntPredicate predicateA = a->a%2==0;

        IntPredicate predicateB = a->a%3==0;
        IntPredicate AB = predicateA.and(predicateB);
        boolean result = AB.test(9);
        System.out.println("9는 2와 3의 배수입니까? "+result);

        AB = predicateA.or(predicateB);
        result = AB.test(9);
        System.out.println("9는 2 혹은 3의 배수입니까? "+result);

        AB = predicateA.negate();
        result = AB.test(9);
        System.out.println("9는 홀수 입니까? "+result);
    }
}
