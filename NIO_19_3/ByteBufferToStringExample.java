package thisIsJava.NIO_19_3;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class ByteBufferToStringExample {
    public static void main(String[] args) {
        Charset charSet = StandardCharsets.UTF_8;
        //문자열-> 인코딩 -> byteBuffer
        String data = "안녕하세요";
        ByteBuffer byteBuffer = charSet.encode(data);

        //ByteBuffer -> 디코딩 -> CharBuffer -> 문자열
        data = charSet.decode(byteBuffer).toString();
        System.out.println("문자열 복원: " + data);
    }
}
