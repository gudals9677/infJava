package thread.join;

public class JoinMainV0 {

    public static void main(String[] args) {
        System.out.println("start");
        Thread thread1 = new Thread(new job(), "thread-1");
        Thread thread2 = new Thread(new job(), "thread-2");

        thread1.start();
        thread2.start();
        System.out.println("end");
    }

    static class job implements Runnable {

        @Override
        public void run() {
            try {
                System.out.println("작업 시작");
                Thread.sleep(2000);
                System.out.println("작업 완료");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
