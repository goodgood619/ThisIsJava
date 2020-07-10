package thisIsJava.Lambda_14_5_6;

import java.util.function.Consumer;

public class ConsumerAndThenExample {
    public static void main(String[] args) {
        Consumer<Member> consumer = m->System.out.println("consumerA : "+m.getName());
        Consumer<Member> consumerB = m->System.out.println("consumerB : "+m.getId());
        Consumer<Member> consumerAB = consumer.andThen(consumerB);
        consumerAB.accept(new Member("둥이","굿굿",null));
    }
}
