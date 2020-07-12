package thisIsJava.Collection_15_3;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<>();

        set.add(new Member("둥둥", 30));
        set.add(new Member("둥둥", 30));
        System.out.println("총 객체수 : " + set.size());
    }
}
