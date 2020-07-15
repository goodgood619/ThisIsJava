package thisIsJava.Stream_16_9;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        /* list에 아무것도 없어서 에러(NoSuchElementException)
        double avg = list.stream()
                .mapToInt(n->n.intValue())
                .average()
                .getAsDouble();
        */

        OptionalDouble optional = list.stream()
                .mapToInt(Integer::intValue)
                .average();
        if (optional.isPresent()) {
            System.out.println("방법1_평균 : " + optional.getAsDouble());
        } else System.out.println("방법1_평균 : 값이 없음");

        double avg = list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0); //OptionalDouble에 값이 저장되지 않았을경우, default값 지정

        System.out.println("방법2 평균 : " + avg); //디폴트값으로 들어옴(0.0)

        list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .ifPresent(a -> System.out.println("방법3_평균 : " + a)); //존재하지 않으니 실행이 안됨
    }
}
