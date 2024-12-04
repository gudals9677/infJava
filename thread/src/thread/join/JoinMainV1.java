package thread.join;

import thread.util.MyLogger;

public class JoinMainV1 {

    public static void main(String[] args) {
        MyLogger.log("start");
        SumTask task1 = new SumTask(1, 50);
        SumTask task2 = new SumTask(51, 100);
        Thread thread1 = new Thread(task1, "thread-1");
        Thread thread2 = new Thread(task2, "thread-2");

        thread1.start();
        thread2.start();

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