package threading04;

public class Counter implements Runnable {

    public static int Counter = 0;
    public static String LockObject = "";

    @Override
    public void run() {
        for (int i = 0; i< 1_000_000; i++) {
            increase();
        }
    }

    //synchronized (this)
    private  void increase() {
        // andere Threads warten
        synchronized (LockObject) {
            Counter = Counter + 1;
        }
    }
}
