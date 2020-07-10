package thisIsJava.Lambda_14_4_1;

public class UsingThis {
    private int outterField = 10;

    void testmethod() {
        MyFunctionalInterface fi = ()->{
            System.out.println(this);
        };
        fi.method();
    }
    class Inner {
        int innerField = 20;
        void method() {
            MyFunctionalInterface fi = ()->{
                System.out.println("outterField : "+outterField);
                System.out.println("UsingThis.this.outterField : "+UsingThis.this.outterField);
                // 바깥 객체의 참조를 얻기위해서는 클래스명.this를 사용

                System.out.println("innerField : "+innerField);
                System.out.println("this.innerField : "+this.innerField); // 람다식 내부에서 this는 Inner 객체를 참조
            };
            fi.method();
        }
    }
}
