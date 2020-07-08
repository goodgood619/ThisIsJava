package thisIsJava.Thread_12_9_4;

import java.nio.channels.CompletionHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallbackExample {
    private ExecutorService executorService;
    public CallbackExample() {
        executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
    }


    private CompletionHandler<Integer, Void> callback = new CompletionHandler<Integer, Void>() {
        @Override
        public void completed(Integer integer, Void aVoid) {
            for(int i=0;i<2000000000;i++){
                    integer--;
            }
            System.out.println(Thread.currentThread().getName());
            System.out.println("completed() 실행 : "+integer);
        }

        @Override
        public void failed(Throwable throwable, Void aVoid) {
            System.out.println("failed() 실행 "+throwable.toString());
        }
    };

    public void doWork(final String x, final String y) {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                try {
                    int nx = Integer.parseInt(x);
                    int ny = Integer.parseInt(y);
                    int result = nx+ny;
                    callback.completed(result,null);
                    System.out.println(Thread.currentThread().getName()+" not blocked");
                }
                catch (NumberFormatException e) {
                    callback.failed(e,null);
                    System.out.println(Thread.currentThread().getName()+" not blocked?");
                }

            }
        };
        executorService.submit(task);
        System.out.println(Thread.currentThread().getName()+" not blocked");
    }

    public void finish() {
        executorService.shutdownNow();
    }


    public static void main(String[] args) {
        CallbackExample example = new CallbackExample();
        example.doWork("3","4");
        example.doWork("3","뱃뱃");
        example.finish();
    }
}
