package thisIsJava.IO_18_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("입력: ");
        String lineString = br.readLine();

        System.out.println("출력 : " + lineString);
    }
}
