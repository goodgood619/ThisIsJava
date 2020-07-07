package thisIsJava.Thread_12_6_4;
/*
    공유객체(DataBox)에 데이터를 저장할 수 있는 data 필드 값이 null이면,
    소비자 스레드를 일시 정지하고, 생산자 스레드를 실행 대기 상태로 만들고
    반대로 data 필드 값이 null이 아니면,
    생산자 스레드를 정지 시키고, 소비자 스레드를 실행 대기 상태로 만든다.
 */
public class DataBox {
    private String data;

    public synchronized String getData() {
        if(this.data == null) {
            try {
                wait();
            }
            catch (InterruptedException e) {

            }
        }
        String returnValue = data;
        System.out.println("ConsumerThread가 읽은 데이터 :"+returnValue);
        data = null;
        notify();
        return returnValue;
    }
    public synchronized void setData(String data) {
        if(this.data!= null) {
            try {
                wait(); // null이 아니면 현재 실행하고 있는 스레드를 일시정지상태로 만들어버림
            }
            catch (InterruptedException e) {

            }
        }
        this.data = data;
        System.out.println("ProducerThread가 생성한 데이터 : "+data);
        notify();
    }
}
