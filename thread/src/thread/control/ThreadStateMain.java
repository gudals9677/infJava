package thread.control;

public class ThreadStateMain {

    public static void main(String[] args) throws InterruptedException{
        Thread thread = new Thread(new MyRunnable(), "MyThread");
        System.out.println("MyThread.state1 = " + thread.getState());
        System.out.println("MyThread start");
        thread.start();
        Thread.sleep(1000);
        System.out.println("MyThread.state3 = " + thread.getState());
    }

    static class MyRunnable implements Runnable {

        @Override
        public void run() {
            try {
                System.out.println("start");
                System.out.println("MyThread.stat2 = " + Thread.currentThread().getState());
                System.out.println("sleep() start");
                Thread.sleep(3000);
                System.out.println("sleep() end");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
