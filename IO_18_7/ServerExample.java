package thisIsJava.IO_18_7;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class ServerExample {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket();
            serverSocket.bind(new InetSocketAddress("localhost",5001));
            while(true) {
                System.out.println("[연결 기다림]");
                Socket socket = serverSocket.accept(); //클라이언트 연결 수락
                InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
                System.out.println("[연결 수락함] "+isa.getHostName());

                byte[] bytes = null;
                String message = null;

                InputStream is = socket.getInputStream();
                bytes = new byte[100];
                int readByteCount = is.read(bytes);

                message = new String(bytes,0,readByteCount, StandardCharsets.UTF_8);
                System.out.println("[데이터 받기 성공]: "+message);

                OutputStream os = socket.getOutputStream();
                message = "Hello, This is 둥석 Server";
                bytes = message.getBytes(StandardCharsets.UTF_8);
                os.write(bytes); //send
                os.flush();
                System.out.println("[데이터 보내기 성공]");

            }


        }
        catch (Exception e){

        }
        if(!serverSocket.isClosed()) {
            try {
                serverSocket.close();
            }
            catch (IOException e){

            }
        }
    }
}
