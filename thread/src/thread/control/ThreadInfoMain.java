package thread.control;

public class ThreadInfoMain {

    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        System.out.println("mainThread::" + mainThread);
    }
}
