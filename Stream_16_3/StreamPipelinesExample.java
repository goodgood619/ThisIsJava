package thisIsJava.Stream_16_3;

import java.util.Arrays;
import java.util.List;

public class StreamPipelinesExample {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("둥이", Member.MALE, 30),
                new Member("둥둥", Member.FEMALE, 20),
                new Member("둥3", Member.MALE, 40),
                new Member("둥4", Member.FEMALE, 10)
        );
        double ageAvg = list.stream()
                .filter(m -> m.getSex() == Member.FEMALE && m.getSex() != Member.MALE) // && m.getSex() != Member.MALE은 생략가능 ㅇㅇ
                .mapToInt(Member::getAge)
                .average()
                .getAsDouble();
        System.out.println("여자 평균 나이: " + ageAvg);

    }
}
