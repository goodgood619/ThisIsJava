package thisIsJava.Thread_12_6_5;

/*
stop flag를 이용해 Thread를 종료하는 방법
 */
public class PrintThread1 extends Thread{
    private boolean stop;

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    @Override
    public void run() {
        while(!stop) {
            System.out.println("실행 중 !!");
        }
        System.out.println("자원 정리");
        System.out.println("스레드 실행 종료");
    }
}
