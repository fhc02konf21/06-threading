package threading01;

public class ConsolePrinter extends Thread {

    private String identifier;

    public ConsolePrinter(String identifier) {
        this.identifier = identifier;
    }

    private void logic() {
        for (int i = 0; i < 1_000; i++) {
            System.out.println(i + ": [identifier: " + identifier + ']');

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run() {
        logic();
    }
}
