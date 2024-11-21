package thread.start;

public class InnerRunnableMainV2 {

    public static void main(String[] args) {
        System.out.println("main() start");

        Runnable run = new Runnable() {

            @Override
            public void run() {
                System.out.println("run");
            }
        };
        Thread thread = new Thread(run);
        thread.start();

        System.out.println("main() end");

    }
}
