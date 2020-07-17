package thisIsJava.Stream_16_11;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExample {
    public static void main(String[] args) {
        List<Student> totalList = Arrays.asList(
                new Student("홍길동", 10, Student.Sex.MALE, Student.City.Seoul),
                new Student("김수애", 10, Student.Sex.FEMALE, Student.City.Busan),
                new Student("신용권", 10, Student.Sex.MALE, Student.City.Busan),
                new Student("박수미", 10, Student.Sex.FEMALE, Student.City.Seoul)
                );

        Map<Student.Sex, List<Student>> mapBySex = totalList.stream()
                .collect(Collectors.groupingBy(s -> s.getSex()));

        System.out.print("[남학생] ");
        mapBySex.get(Student.Sex.MALE).stream()
                .forEach(s -> System.out.print(s.getName() + " "));

        System.out.println("\n[여학생] ");
        mapBySex.get(Student.Sex.FEMALE).stream()
                .forEach(s -> System.out.println(s.getName() + " "));

        System.out.println();

        Map<Student.City, List<String>> mapByCity = totalList.stream()
                .collect(
                        Collectors.groupingBy(
                                s -> s.getCity(), Collectors.mapping(s -> s.getName(), Collectors.toList())
                        )
                );

        System.out.print("\n[서울] ");
        mapByCity.get(Student.City.Seoul).stream().forEach(s -> System.out.print(s + " "));

        System.out.println("\n[부산] ");
        mapByCity.get(Student.City.Busan).stream().forEach(s -> System.out.println(s + " "));

    }
}
