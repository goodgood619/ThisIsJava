package thisIsJava.IO_18_4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\ThisisJava공부용\\file1.txt");
        FileWriter fw = new FileWriter(file, true);
        fw.write("FileWriter는 한글로된 " + "\r\n");
        fw.write("문자열을 바로 출력할 수 있다." + "\r\n"); // 그런데 뭔가 이미 만들어지고 안에 무언가 내용이 써있다면 제대로 값이 출력이 안됨
        fw.flush();
        fw.close();
        System.out.println("파일에 저장되었습니다");
    }
}
