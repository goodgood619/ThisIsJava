package thisIsJava.Stream_16_12;

import java.util.Arrays;
import java.util.List;

public class MaleStudentExample {
    public static void main(String[] args) {
        List<Student> totalList = Arrays.asList(
                new Student("홍길동", 10, Student.Sex.MALE),
                new Student("둥이", 10, Student.Sex.FEMALE),
                new Student("둥둥", 10, Student.Sex.MALE),
                new Student("뚱이", 10, Student.Sex.FEMALE)
        );

        MaleStudent maleStudent = totalList.parallelStream()
                .filter(s -> s.getSex() == Student.Sex.MALE)
                .collect(() -> new MaleStudent(), (m, s) -> m.accumulate(s), (m, sm) -> m.combine(sm));

        maleStudent.getList().stream()
                .forEach(s -> System.out.println(s.getName()));

    }
}
