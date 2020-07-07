package thisIsJava.Thread_12_6_5;

/*
Interrupt에 의한 스레드 종료
 */
public class PrintThread2 extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("실행 중 !!");
            if (Thread.interrupted()) break; // thread.interrupt()를 호출하면 이쪽으로 이동되게 된다.
        }

        System.out.println("자원 정리");
        System.out.println("스레드 실행 종료");
    }
}
