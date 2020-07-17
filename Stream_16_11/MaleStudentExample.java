package thisIsJava.Stream_16_11;

import java.util.Arrays;
import java.util.List;

public class MaleStudentExample {
    public static void main(String[] args) {
        List<Student> totalList = Arrays.asList(
                new Student("홍길동", 10, Student.Sex.MALE),
                new Student("둥이", 6, Student.Sex.FEMALE),
                new Student("둥둥", 10, Student.Sex.MALE),
                new Student("뚱이", 6, Student.Sex.FEMALE)
        );

        MaleStudent maleStudent = totalList.stream()
                .filter(s -> s.getSex() == Student.Sex.MALE)
                .collect(MaleStudent::new, MaleStudent::accumulate, MaleStudent::combine);

        maleStudent.getList().stream()
                .forEach(n -> System.out.println(n.getName()));
    }
}
