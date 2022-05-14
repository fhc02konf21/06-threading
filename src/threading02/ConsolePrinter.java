package threading02;

public class ConsolePrinter implements Runnable {

    private String identifier;

    public ConsolePrinter(String identifier) {
        this.identifier = identifier;
        pleaseStop = false;
    }

    public boolean pleaseStop;

    private void logic() {
        for (int i = 0; i < 1_000; i++) {
            System.out.println(i + ": [identifier: " + identifier + ']');

            if (pleaseStop == true) {
                System.out.println( identifier + ": somebody asked me to stop running?");
                break;
            }

            if (Thread.currentThread().isInterrupted()) {
                System.out.println( identifier + ": somebody interrupted me");
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {

                e.printStackTrace();
                break;
            }
        }
    }

    @Override
    public void run() {
        logic();
    }
}
