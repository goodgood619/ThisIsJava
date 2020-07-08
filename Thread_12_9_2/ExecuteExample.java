package thisIsJava.Thread_12_9_2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecuteExample {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2); // 최대 스레드갯수 2인 스레드 풀 생성

        for(int i=0;i<10;i++) {
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
                    int poolSize = threadPoolExecutor.getPoolSize();
                    String threadName = Thread.currentThread().getName();
                    System.out.println("[총 스레드 갯수: "+poolSize+"] 작업 스레드 이름:"+threadName);
                    int value = Integer.parseInt("삼");
                }
            };
//            executorService.execute(runnable); // 작업 처리 요청
             executorService.submit(runnable);
            Thread.sleep(10);
        }
        executorService.shutdown(); //스레드풀종료
    }
}
