package thisIsJava.Collection_15_5;

public class Person implements Comparable<Person> {
    String name;
    int age;

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }


    @Override
    public int compareTo(Person person) {
        if (this.age < person.age) return -1;
        else if (this.age == person.age) return 0;
        else return 1;
    }
}
