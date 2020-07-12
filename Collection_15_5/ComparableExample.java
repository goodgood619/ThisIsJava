package thisIsJava.Collection_15_5;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample {
    public static void main(String[] args) {
        TreeSet<Person> treeSet = new TreeSet<>();

        treeSet.add(new Person("홍길동", 45));
        treeSet.add(new Person("둥이", 25));
        treeSet.add(new Person("뚱이", 31));
        Iterator<Person> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            System.out.println(person.name + ":" + person.age);
        }
    }
}
