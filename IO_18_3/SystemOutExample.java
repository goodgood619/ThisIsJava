package thisIsJava.IO_18_3;

import java.io.IOException;
import java.io.OutputStream;

public class SystemOutExample {
    public static void main(String[] args) throws IOException {
        OutputStream os = System.out;

        for(byte b = 48;b<58;b++) {
            os.write(b);
        }
        os.write(10); //라인피드(10)을 출력하면 다음행으로 넘어간다
        for(byte b= 97;b<123;b++) {
            os.write(b);
        }
        os.write(10);

        String hangul = "가나다마라바상라ㅏ다삳사ㅏㄴ아ㅏ";
        byte[] hangulBytes = hangul.getBytes();
        os.write(hangulBytes);
        os.flush();
    }
}
