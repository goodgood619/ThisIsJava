package thisIsJava.Stream_16_12;

import java.util.Arrays;
import java.util.List;

public class SequencialVsParallelExample {
    public static void work(int value) {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //
    public static long testSequencial(List<Integer> list) {
        long start = System.nanoTime();
        list.stream().forEach(n -> work(n));
        long end = System.nanoTime();
        long runTime = end - start;
        return runTime;
    }

    public static long testParallel(List<Integer> list) {
        long start = System.nanoTime();
        list.stream().parallel().forEach(n -> work(n));
        long end = System.nanoTime();
        long runTime = end - start;
        return runTime;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        //순차 스트림 처리 시간 구하기
        long timeSequencial = testSequencial(list);

        // 병렬 스트림 처리 시간 구하기
        long timeParallel = testParallel(list);

        if (timeParallel < timeSequencial) {
            System.out.println("병렬 처리가 더 빠름 "+"병렬 처리 시간: "+timeParallel+" 순차 처리 시간 :"+timeSequencial);
        } else System.out.println("순차 처리가 더 빠름");
    }
}
