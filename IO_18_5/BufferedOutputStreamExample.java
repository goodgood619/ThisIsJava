package thisIsJava.IO_18_5;

import java.io.*;

public class BufferedOutputStreamExample {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        int data = -1;
        long start = 0, end = 0;
        fis = new FileInputStream("C:\\Users\\user\\Pictures\\2.PNG");
        bis = new BufferedInputStream(fis);
        fos = new FileOutputStream("C:\\Users\\user\\Pictures\\2.PNG");
        start = System.currentTimeMillis();
        while ((data = bis.read()) != -1) {
            fos.write(data);
        }
        fos.flush();
        end = System.currentTimeMillis();
        fos.close();
        bis.close();
        fis.close();
        System.out.println("사용하지 않았을 때 :" + (end - start) + " ms");

        fis = new FileInputStream("C:\\Users\\user\\Pictures\\2.PNG");
        bis = new BufferedInputStream(fis);
        fos = new FileOutputStream("C:\\Users\\user\\Pictures\\2.PNG");
        bos = new BufferedOutputStream(fos);
        start = System.currentTimeMillis();
        while ((data = bis.read()) != -1) {
            bos.write(data);
        }
        bos.flush();
        end = System.currentTimeMillis();
        bos.close();
        fos.close();
        bis.close();
        fis.close();
        System.out.println("사용했을때 : " + (end - start) + " ms");
    }
}
