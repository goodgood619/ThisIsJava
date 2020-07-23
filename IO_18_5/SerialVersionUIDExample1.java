package thisIsJava.IO_18_5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialVersionUIDExample1 {
    public static void main(String[] args) throws IOException {
        /*직렬화할 클래스가 바뀌면 SerialVersionUID가 자동적으로 변경이 되어서, 역직렬화할때 에러가 나는거같은데
        * 현재는 안남.. 흠
        * */
        FileOutputStream fos = new FileOutputStream("C:\\ThisisJava공부용\\file5.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        ClassC classC = new ClassC();
        classC.field1 = 1;
        classC.field2 = 10;
        oos.writeObject(classC);
        oos.flush();
        oos.close();
        fos.close();
    }
}
