package thisIsJava.IO_18_7;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class ClientExample {
    public static void main(String[] args) {
        Socket socket = null;
        try {
            socket = new Socket();
            System.out.println("[연결 요청]");
            socket.connect(new InetSocketAddress("localhost",5001));
            System.out.println("[연결 성공]");

            /*InputStream and OutPutStream */
            byte[] bytes = null;
            String message = null;

            OutputStream os = socket.getOutputStream();
            message = "Hello Test";
            bytes = message.getBytes(StandardCharsets.UTF_8);
            os.write(bytes);
            os.flush();
            System.out.println("[데이터 보내기 성공]");

            InputStream is = socket.getInputStream();
            bytes = new byte[100];
            int readByteCount = is.read(bytes);
            message = new String(bytes,0,readByteCount, StandardCharsets.UTF_8);
            System.out.println("[데이터 받기 성공] "+message);

            os.close();
            is.close();
        }
        catch (Exception e) {
            
        }

        if(!socket.isClosed()) { //연결되어있을경우
            try {
                socket.close();
            }
            catch (IOException e){
                
            }
        }
    }
}
