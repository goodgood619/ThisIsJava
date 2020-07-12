package thisIsJava.Collection_15_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Java");
        list.add("JDBC");
        list.add("Servlet/JSP");
        list.add(2,"Database");
        list.add("Mybatis");

        int size = list.size();
        System.out.println("총 객체수 : "+size);
        System.out.println();

        String skill = list.get(2);
        System.out.println("2: "+skill);
        System.out.println();


        List<String> list1 = Arrays.asList("굿굿","뱃뱃","둥둥");
        for(String name : list1) {
            System.out.println(name);
        }

        List<Integer> list2 = Arrays.asList(1,2,3);
        for(int value : list2) {
            System.out.println(value);
        }
    }
}
