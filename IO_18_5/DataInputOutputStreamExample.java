package thisIsJava.IO_18_5;

import java.io.*;

public class DataInputOutputStreamExample {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("C:\\ThisisJava공부용\\file1.txt");
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeUTF("홍길동");
        dos.writeDouble(95.5);
        dos.writeInt(1);

        dos.writeUTF("감자름ㄴ읾");
        dos.writeDouble(90.3);
        dos.writeInt(2);
        dos.flush();
        dos.close();
        fos.close();
        // 이예제는 제대로 출력이 안되는듯 ㅇㅇ..
        FileInputStream fis = new FileInputStream("C:\\ThisisJava공부용\\file1.txt");
        DataInputStream dis = new DataInputStream(fis);

        for (int i = 0; i < 2; i++) {
            String name = dis.readUTF();
            double score = dis.readDouble();
            int order = dis.readInt();
            System.out.println(name + " : " + score + " : " + order);
        }
        dis.close();
        fis.close();
    }
}
