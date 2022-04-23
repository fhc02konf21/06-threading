package threading02;

public class ConsolePrinterDemoApp {

    public static void main(String[] args) throws InterruptedException {


        ConsolePrinter cpA = new ConsolePrinter("A");
        ConsolePrinter cpB = new ConsolePrinter("B");

        Thread threadA = new Thread(cpA);
        Thread threadB = new Thread(cpB);

        threadA.start();
        threadB.start();

       // threadA.join();
       // threadB.join();
        System.out.println("Programm ist beendet");
    }
}
