package thisIsJava.NIO_19_3;

import java.nio.ByteBuffer;

public class CompactExample {
    public static void main(String[] args) {
        System.out.println("[7바이트 크기로 버퍼 생성]");
        ByteBuffer buffer = ByteBuffer.allocateDirect(7);
        buffer.put((byte) 10);
        buffer.put((byte) 11);
        buffer.put((byte) 12);
        buffer.put((byte) 13);
        buffer.put((byte) 14);
        buffer.flip(); //데이터 읽기 위해 위치 속성값 앞으로 이동 position 0으로
        printState(buffer);

        buffer.get(new byte[3]);
        System.out.println("[3바이트를 읽음]");

        buffer.compact();
        System.out.println("[compact() 실행후 ]");
        printState(buffer);
    }

    private static void printState(ByteBuffer buffer) {
        System.out.print(buffer.get(0) + ", " + buffer.get(1) + ", " + buffer.get(2) + ", " + buffer.get(3) + ", " + buffer.get(4) + "\n");
        System.out.print("position:" + buffer.position() + ", " + "limit:" + buffer.limit() + ", " + "capacity:" + buffer.capacity() + "\n");
    }
}
