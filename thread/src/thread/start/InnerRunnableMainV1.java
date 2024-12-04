package thread.start;

public class InnerRunnableMainV1 {

    public static void main(String[] args) {
        System.out.println("main() start");

        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();

        System.out.println("main() end");

    }

    static class MyRunnable implements Runnable {

        @Override
        public void run() {
            System.out.println("run");
        }
    }
}
