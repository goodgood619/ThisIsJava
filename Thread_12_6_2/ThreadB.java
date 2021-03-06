package thisIsJava.Thread_12_6_2;

public class ThreadB extends Thread{
    public boolean stop = false; // 종료 플래그
    public boolean work = true; // 작업 진행여부 플래그

    @Override
    public void run() {
        while(!stop) {
            if(work) {
                System.out.println("ThreadB 작업내용");
            }
            else {
                Thread.yield();
            }
        }
        System.out.println("ThreadB 종료");
    }
}
