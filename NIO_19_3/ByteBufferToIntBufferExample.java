package thisIsJava.NIO_19_3;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.Arrays;

public class ByteBufferToIntBufferExample {
    public static void main(String[] args) {
        // int[] -> IntBuffer -> ByteBuffer
        int[] writeData = {10, 20};
        IntBuffer writeIntBuffer = IntBuffer.wrap(writeData);
        ByteBuffer writeByteBuffer = ByteBuffer.allocate(writeIntBuffer.capacity() * 4);
        for (int i = 0; i < writeIntBuffer.capacity(); i++) {
            writeByteBuffer.putInt(writeIntBuffer.get(i));
        }

        writeByteBuffer.flip();

        //ByteBuffer -> IntBuffer -> int[]
        ByteBuffer readByteBuffer = writeByteBuffer;
        IntBuffer readIntBuffer = readByteBuffer.asIntBuffer();
        int[] readData = new int[readIntBuffer.capacity()];
        readIntBuffer.get(readData); // get(int[] dst); dst 즉 목적지이다. readData로 readIntBuffer에 쌓였던것을 읽어서 옮긴다
        System.out.println("배열 복원 : " + Arrays.toString(readData));
    }
}
