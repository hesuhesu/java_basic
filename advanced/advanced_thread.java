package advanced;

import java.util.ArrayList;

public class advanced_thread implements Runnable {
    // 주로 Runnable 인터페이스를 사용한다.
    // 왜냐하면 Thread 클래스를 상속하면 Thread 클래스를 상속한 클래스가 다른 클래스를 상속할 수 없기 때문이다.
    int seq;

    public advanced_thread(int seq) {
        this.seq = seq;
    }
    public void run() {
        System.out.println(this.seq + " thread start.");  // 쓰레드 시작
        try {
            Thread.sleep(1000);  // 1초 대기한다.
        } catch (Exception e) {
            System.out.println("대기 실패");
        }
        System.out.println(this.seq + " thread end.");  // 쓰레드 종료
    }
    public static void main (String[] args){
        ArrayList<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++) {  // 총 10개의 쓰레드를 생성하여 실행한다.
            // Thread t = new advanced_thread(i);
            Thread t = new Thread(new advanced_thread(i));
            t.start();
            threads.add(t);
        }
        // 모든 스레드가 종료된 후에 main 메서드를 종료하고 싶은 경우에는 어떻게 해야 할까?

        // join
        for(int i=0; i<threads.size(); i++) {
            Thread t = threads.get(i);
            try {
                t.join(); // t 쓰레드가 종료할 때까지 기다린다.
            }catch(Exception e) {
            }
        }

        System.out.println("main end.");  // main 메서드 종료

        // 인터페이스를 사용한 경우에는 다른 클래스 상속이 가능하므로 좀 더 유연한 프로그램으로 만들 수 있다.
    }
}
