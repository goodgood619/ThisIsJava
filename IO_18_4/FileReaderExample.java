package thisIsJava.IO_18_4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\Users\\user\\IdeaProjects\\Practice\\src\\thisisJava\\IO_18_4\\fileReaderExample.java");

        int readCharNo;
        char[] cbuf = new char[100];
        while((readCharNo=fr.read(cbuf))!=-1) {
            String data = new String(cbuf,0,readCharNo);
            System.out.print(data);
        }
        fr.close();
    }
}
