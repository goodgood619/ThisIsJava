package thisIsJava.IO_18_8;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;

public class UdpReceiveExample extends Thread{
    public static void main(String[] args) throws InterruptedException, SocketException {
        DatagramSocket datagramSocket = new DatagramSocket(5001);

        Thread thread = new Thread() {
            public void run() {
                System.out.println("[수신 시작]");
                try {
                    while(true) {
                        DatagramPacket packet = new DatagramPacket(new byte[100],100);
                        datagramSocket.receive(packet);

                        String data = new String(packet.getData(),0,packet.getLength(), StandardCharsets.UTF_8);
                        System.out.println("[받은 내용 : ]"+packet.getSocketAddress()+"] "+data);
                    }
                }
                catch (Exception e) {
                    System.out.println("[수신 종료]");
                }
            }
        };
        thread.start();

        Thread.sleep(10000);
        datagramSocket.close();
    }
}
