package thisIsJava.Lambda_14_4_2;

public class UsingLocalVariable {
    void method(int args) {
        int localVar = 40; // localVar는 final 특성을 지님

//         args = 31;
//         localVar = 50;

        MyFunctionalInterface fi = () -> {
            System.out.println("arg : " + args); // 이렇게 바꾸게 되면,
            // Variable Should be used in lambda Expression, should be final, effectively final
            System.out.println("localVar : " + localVar);
        };
        fi.method();
    }
}
