package thisIsJava.IO_18_4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
    public static void main(String[] args) throws IOException {
        String originalFileName = "C:\\Users\\user\\Pictures\\캡처.PNG";
        String targetFileName = "C:\\Users\\user\\Pictures\\캡처복사테스트.PNG";

        FileInputStream fs = new FileInputStream(originalFileName);
        FileOutputStream fsout = new FileOutputStream(targetFileName);

        int readByteNo;
        byte[] readBytes = new byte[100];
        while((readByteNo = fs.read(readBytes))!=-1) {
            fsout.write(readBytes,0,readByteNo);
        }
        fsout.flush();
        fsout.close();
        fs.close();
        System.out.println("복사가 잘 되었습니다.");
    }
}
