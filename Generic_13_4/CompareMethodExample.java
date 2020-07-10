package thisIsJava.Generic_13_4;

public class CompareMethodExample {
    public static void main(String[] args) {
        Pair<Integer,String> p1 = new Pair<>(1,"사과");
        Pair<Integer,String> p2 = new Pair<>(1,"사과");
        boolean result1 = Util.compare(p1,p2);
        System.out.println(result1?"논리적으로 동등한 객체입니다":"논리적으로 동등하지 않은 객체입니다");

        Pair<String,String> p3 = new Pair<>("user1","홍길동");
        Pair<String,String> p4 = new Pair<>("user2","홍길동");
        boolean result2 = Util.compare(p3,p4);
        System.out.println(result2?"논리적으로 동등한 객체입니다":"논리적으로 동등하지 않은 객체입니다");
    }
}
