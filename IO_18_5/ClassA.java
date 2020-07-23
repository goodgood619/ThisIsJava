package thisIsJava.IO_18_5;

import java.io.Serializable;

public class ClassA implements Serializable {
    int field1;
    ClassB field2 = new ClassB();
    static int field3; // 직렬화 X
    transient int field4; // 직렬화 X
}
