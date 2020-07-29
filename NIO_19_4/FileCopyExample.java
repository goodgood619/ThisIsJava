package thisIsJava.NIO_19_4;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileCopyExample {
    public static void main(String[] args) throws IOException {
        Path from = Paths.get("C:\\Users\\user\\Pictures\\캡처.PNG");
        Path to = Paths.get("C:\\Users\\user\\Pictures\\캡처복사.PNG");

        FileChannel fileChannel_from = FileChannel.open(from, StandardOpenOption.READ);
        FileChannel fileChannel_to = FileChannel.open(to, StandardOpenOption.CREATE, StandardOpenOption.WRITE);

        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(100);
        int byteCount;
        while (true) {
            byteBuffer.clear();
            byteCount = fileChannel_from.read(byteBuffer);
            if (byteCount == -1) break;
            byteBuffer.flip();
            fileChannel_to.write(byteBuffer);
        }
        fileChannel_from.close();
        fileChannel_to.close();
        System.out.println("파일 복사 성공");
    }
}
