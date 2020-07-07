package thisIsJava.Thread_12_6_2;

public class YieldExample {
    public static void main(String[] args) {
        ThreadA threadA = new ThreadA();
        ThreadB threadB = new ThreadB();
        threadA.start();
        threadB.start();

        try{
            Thread.sleep(3000);
        }
        catch (InterruptedException e){

        }
        threadA.work = false; //B만실행

        try{
            Thread.sleep(3000);
        }
        catch (InterruptedException e){

        }
        threadA.work = true; // A,B 둘다 실행

        try{
            Thread.sleep(3000);
        }
        catch (InterruptedException e) {

        }
        threadA.stop = true; //A종료
        threadB.stop = true; // B종료
    }
}
