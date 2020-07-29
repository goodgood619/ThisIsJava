package thisIsJava.NIO_19_4;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileChannelWriteExample {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\ThisisJava공부용\\file6.txt");
        Files.createDirectories(path.getParent());

        FileChannel fileChannel = FileChannel.open(path, StandardOpenOption.CREATE, StandardOpenOption.WRITE);

        String data = "안녕하세요";
        Charset charset = Charset.defaultCharset();
        ByteBuffer byteBuffer = charset.encode(data);

        int byteCount = fileChannel.write(byteBuffer);
        System.out.println("file6.txt : " + byteCount + " bytes written");

        fileChannel.close();
    }
}
