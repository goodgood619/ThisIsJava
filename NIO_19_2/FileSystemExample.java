package thisIsJava.NIO_19_2;

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class FileSystemExample {
    public static void main(String[] args) throws IOException {
        FileSystem fileSystem = FileSystems.getDefault();
        for (FileStore fileStore : fileSystem.getFileStores()) {
            System.out.println("드라이버명 : " + fileStore.name());
            System.out.println("파일시스템 : " + fileStore.type());
            System.out.println("전체 공간 : " + fileStore.getTotalSpace() + " 바이트");
            System.out.println("사용 중인 공간 : " + (fileStore.getTotalSpace() - fileStore.getUnallocatedSpace()) + "바이트");
            System.out.println("사용 가능 공간 : " + fileStore.getUsableSpace() + "바이트");
            System.out.println();
        }
        System.out.println("파일 구분자 : " + fileSystem.getSeparator());
        System.out.println();
        for (Path path : fileSystem.getRootDirectories()) {
            System.out.println(path.toString());
        }
    }
}
