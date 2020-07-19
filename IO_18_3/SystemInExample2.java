package thisIsJava.IO_18_3;

import java.io.IOException;
import java.io.InputStream;

public class SystemInExample2 {
    public static void main(String[] args) throws IOException {
        InputStream is = System.in;

        byte[] datas = new byte[100];

        System.out.print("이름: ");
        int nameBytes = is.read(datas);
        String name = new String(datas,0,nameBytes-1); // 끝에 2바이트는 Enter키에 해당하는 키리티 리턴(13)과 라인 피드(10)이므로 제외
        // 근데 실제해보니 1바이트만 제외하는게 정확하게 나오긴함, 2바이트 해보니 끝문자가 이상하게 출력됨
        System.out.print("하고 싶은말 : ");
        int commentBytes = is.read(datas);
        String comment = new String(datas,0,commentBytes-1);
        System.out.print("입력한 이름 : "+name+"\n입력한 하고 싶은 말 : "+comment);
    }
}
