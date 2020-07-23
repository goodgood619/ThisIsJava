package thisIsJava.IO_18_5;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializableReader {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("C:\\ThisisJava공부용\\file3.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        ClassA v = (ClassA) ois.readObject();
        System.out.println("field1 : " + v.field1);
        System.out.println("field2.field1 : " + v.field2.field1);
        System.out.println("field3: " + v.field3); //static의 경우는 0으로 복원화됨, 왜냐하면 field3의 데이터가 없기때문
        System.out.println("field4 : " + v.field4); // transient의 경우도 위의 static과 마찬가지
    }
}
