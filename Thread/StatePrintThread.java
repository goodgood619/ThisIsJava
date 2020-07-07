package thisIsJava.Thread;

public class StatePrintThread extends Thread{
    private Thread targetThread;
    public StatePrintThread(Thread targetThread) {
        this.targetThread = targetThread;
    }
    public void run() {
        while(true) {
            Thread.State state = targetThread.getState();
            System.out.println("Target Thread 상태: "+state);

            if(state == Thread.State.NEW) { // 객체 생성 상태일경우 -> 실행 대기 상태로 만듬듬
               targetThread.start();
            }
            if(state == State.TERMINATED) {
                break;
            }
            try {
                Thread.sleep(500);
            }
            catch (Exception e) {

            }
        }
    }
}
