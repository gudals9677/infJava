package thread.join;

public class JoinMainV3 {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("start");
        SumTask task1 = new SumTask(1, 50);
        SumTask task2 = new SumTask(51, 100);
        Thread thread1 = new Thread(task1, "thread-1");
        Thread thread2 = new Thread(task2, "thread-2");

        thread1.start();
        thread2.start();

        // 스레드 종료때 까지 대기
        System.out.println("join() - main 스레드가 종료까지 대기");
        thread1.join();
        thread2.join();
        System.out.println("join() - main 스레드 대기완료");

        System.out.println("task1.result = " + task1.result);
        System.out.println("task2.result = " + task2.result);

        int sumAll = task1.result + task2.result;
        System.out.println("task1 + task2 = " + sumAll);
        System.out.println("end");
    }

    static class SumTask implements Runnable {

        int startValue;
        int endValue;
        int result = 0;

        public SumTask(int startValue, int endValue) {
            this.startValue = startValue;
            this.endValue = endValue;
        }

        @Override
        public void run() {
            try {
                System.out.println("작업 시작");
                Thread.sleep(2000);
                int sum = 0;
                for (int i = startValue; i <= endValue; i++) {
                    sum += i;
                }
                result = sum;
                System.out.println("작업 완료 result = " + result);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
