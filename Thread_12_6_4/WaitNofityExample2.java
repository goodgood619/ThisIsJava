package thisIsJava.Thread_12_6_4;

import javax.swing.*;

public class WaitNofityExample2 {
    public static void main(String[] args) {
        DataBox dataBox = new DataBox();
        ProducerThread producerThread = new ProducerThread(dataBox);
        ConsumerThread consumerThread = new ConsumerThread(dataBox);

        producerThread.start();
        consumerThread.start();
    }
}
