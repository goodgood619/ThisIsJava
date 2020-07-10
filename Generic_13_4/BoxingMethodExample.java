package thisIsJava.Generic_13_4;

public class BoxingMethodExample {
    public static void main(String[] args) {
        Box<Integer> box1 = Util.boxing(100);
        int intValue = box1.getT();

        Box<String> box2 = Util.boxing("굿굿");
        String strValue = box2.getT();

        System.out.println(intValue + strValue);
    }
}
