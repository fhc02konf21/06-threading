package threading02;

public class ConsolePrinterDemoApp {

    public static void main(String[] args) throws InterruptedException {


        ConsolePrinter cpA = new ConsolePrinter("A");
        ConsolePrinter cpB = new ConsolePrinter("B");

        Thread threadA = new Thread(cpA);
        Thread threadB = new Thread(cpB);

        threadA.start();
        threadB.start();

        Thread.sleep(5000);
        // jetzt komme ich drauf, ich würde gerne abbrechen
        System.out.println("jetzt abbrechen");
        //threadA.stop(); => unhöfliches stoppen
        //threadB.stop(); => sollte nicht mehr verwendet werden

        //cpA.pleaseStop = true; // freundliches stoppen
        //cpB.pleaseStop = true;

        threadA.interrupt();
        threadB.interrupt();

        threadA.join();
        threadB.join();
        System.out.println("Programm ist beendet");
    }
}
