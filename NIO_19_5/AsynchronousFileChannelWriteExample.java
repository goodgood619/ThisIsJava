package thisIsJava.NIO_19_5;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.CompletionHandler;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.EnumSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AsynchronousFileChannelWriteExample {
    public static void main(String[] args) throws IOException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        for (int i = 0; i < 10; i++) {
            Path path = Paths.get("C:\\ThisisJava공부용\\file" + i + ".txt");
            Files.createDirectories(path.getParent());

            AsynchronousFileChannel fileChannel = AsynchronousFileChannel.open(
                    path,
                    EnumSet.of(StandardOpenOption.CREATE,StandardOpenOption.WRITE),
                    executorService
            );

            Charset charset = Charset.defaultCharset();
            ByteBuffer byteBuffer = charset.encode("안녕하세요");

            class Attachment {
                Path path;
                AsynchronousFileChannel fileChannel;
                ByteBuffer byteBuffer;
            }
            Attachment attachment = new Attachment();
            attachment.path = path;
            attachment.fileChannel = fileChannel;
            attachment.byteBuffer = byteBuffer;

            CompletionHandler<Integer, Attachment> completionHandler = new CompletionHandler<>() {
                @Override
                public void completed(Integer result, Attachment attachment) {

                    System.out.println(attachment.path.getFileName() + " : " + result + " bytes written : " + Thread.currentThread().getName());
                    try {
                        attachment.fileChannel.close();
                    } catch (IOException e) {

                    }
                }

                @Override
                public void failed(Throwable throwable, Attachment attachment) {
                    throwable.printStackTrace();
                    try {
                        attachment.fileChannel.close();
                    } catch (IOException e) {

                    }
                }
            };

            fileChannel.write(byteBuffer, 0, attachment, completionHandler);
        }
        Thread.sleep(1500); //먼저 shutdown되서 에러뜨는걸 방지하기 위함, 물론 shutdown이 먼저 걸려서 사라져도, 남은일(file(i).txt를 만드는일)은 하고 반납이됨
        executorService.shutdown();
    }
}
