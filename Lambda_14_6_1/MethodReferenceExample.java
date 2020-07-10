package thisIsJava.Lambda_14_6_1;

import java.util.function.IntBinaryOperator;

public class MethodReferenceExample {
    public static void main(String[] args) {
        // 정적메소드참조(인스턴스 구지 필요없다)
        IntBinaryOperator operator = (x, y) -> Calculator.staticMethod(x, y);
        System.out.println("결과 1: " + operator.applyAsInt(1, 2));

        operator = Calculator::staticMethod;
        System.out.println("결과 2: " + operator.applyAsInt(13, 5));

        //인스턴스 메소드 참조(new 연산자로 할당된 인스턴스가 필요하다)
        Calculator obj = new Calculator();
        operator = (x, y) -> obj.instanceMethod(x, y);
        System.out.println("결과 3 : " + operator.applyAsInt(5, 6));

        operator = obj::instanceMethod;
        System.out.println("결과 4: " + operator.applyAsInt(7, 8));
    }
}
