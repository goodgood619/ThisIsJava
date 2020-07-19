package thisIsJava.IO_18_4;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {
    public static void main(String[] args) {
        File dir = new File("C:\\ThisisJava공부용");
        File file1 = new File("C:\\ThisisJava공부용\\file1.txt");
        File file2 = new File("C:\\ThisisJava공부용\\file2.txt");

        File temp = new File("C:\\ThisisJava공부용");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd a   HH:mm");
        File[] contents = temp.listFiles();

        System.out.println("날짜      시간      형태      크기      이름");
        System.out.println("----------------------------------------");
        for(File file : contents) {
            System.out.print(sdf.format(new Date(file.lastModified())));
            if(file.isDirectory()) {
                System.out.print("\t<DIR>\t\t\t"+file.getName());
            }
            else {
                System.out.print("\t\t\t"+file.length()+"\t"+file.getName());
            }
            System.out.println();
        }

    }
}
