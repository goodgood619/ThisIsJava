package thisIsJava.Stream_16_2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromDirectoryExample {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Program Files");
        Stream<Path> pathStream = Files.list(path);
        pathStream.forEach(p->System.out.println(p.getFileName()));
    }
}
