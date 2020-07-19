package thisIsJava.IO_18_4;

import java.io.FileInputStream;

public class FileInputStreamExample {
    public static void main(String[] args) {
        try {
            FileInputStream fs = new FileInputStream("C:\\Users\\user\\IdeaProjects\\Practice\\src\\thisIsJava\\IO_18_4\\FileExample.java");
            int data;

            while ((data = fs.read()) != -1) {
                System.out.write(data);
            }
            fs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
