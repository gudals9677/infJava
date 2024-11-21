package thread.start;

public class InnerRunnableMainV3 {

    public static void main(String[] args) {
        System.out.println("main() start");

        Thread thread = new Thread(() -> System.out.println("run"));
        thread.start();

        System.out.println("main() end");

    }
}
