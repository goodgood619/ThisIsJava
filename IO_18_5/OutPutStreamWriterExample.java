package thisIsJava.IO_18_5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutPutStreamWriterExample {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("C:\\ThisisJava공부용\\file1.txt");
        Writer writer = new OutputStreamWriter(fos);

        String data = "바이트 출려ㄱ스트림을 문자 출력 스트림으로 변환 이거 ㅇㅇadsfads";
        writer.write(data);

        writer.flush();
        writer.close();
        System.out.println("파일 저장이 끝났습니다");
    }
}
