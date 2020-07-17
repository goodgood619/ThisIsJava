package thisIsJava.Stream_16_11;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ToListExample {
    public static void main(String[] args) {
        List<Student> totalList = Arrays.asList(
                new Student("홍길동", 10, Student.Sex.MALE),
                new Student("둥이", 6, Student.Sex.FEMALE),
                new Student("둥둥", 10, Student.Sex.MALE),
                new Student("뚱이", 6, Student.Sex.FEMALE)
        );

        List<Student> maleList = totalList.stream()
                .filter(n -> n.getSex() == Student.Sex.MALE)
                .collect(Collectors.toList());
        maleList.stream()
                .forEach(n -> System.out.println(n.getName()));

        System.out.println();

        Set<Student> femaleSet = totalList.stream()
                .filter(n -> n.getSex() == Student.Sex.FEMALE)
                .collect(Collectors.toSet()); //이거 좀 어려운듯 ㅇㅇ,원래 .collect(Collectors.toCollection(HashSet::new))
            // 이건데, 어차피 supplier니까(매개값은 없고 리턴값만 있는) 새롭게 HashSet을 만들겠다는 의미니까, 그냥 저렇게써도 상관이 없지않을까

        femaleSet.stream()
                .forEach(n -> System.out.println(n.getName()));
    }
}
