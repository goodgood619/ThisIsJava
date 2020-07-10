package thisIsJava.Lambda_14_5_6;

import java.util.function.Function;

public class FunctionAndThenComposeExample {
    public static void main(String[] args) {
        Function<Member, Address> functionA;
        Function<Address, String> functionB;
        Function<Address,Number> functionC;
        Function<Member, String> functionAB;
        Function<Member,Number> functionABC;
        String city;

        functionA = m -> m.getAddress();
        functionB = m -> m.getCity();
        functionC = m->m.hashCode();
        functionAB = functionA.andThen(functionB);
        city = functionAB.apply(new Member("둥이", "굿굿", new Address("한국", "안양")));
        System.out.println("거주 도시 : " + city);

        functionAB = functionB.compose(functionA);
        city = functionAB.apply(new Member("둥이", "굿굿", new Address("한국", "안양")));
        System.out.println("거주 도시 : " + city);

        functionABC = functionA.andThen(functionC);
        int hashcode = (int) functionABC.apply(new Member("둥이", "굿굿", new Address("한국", "안양")));
        System.out.println(hashcode);
    }
}
