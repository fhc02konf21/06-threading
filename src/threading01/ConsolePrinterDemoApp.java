package threading01;

public class ConsolePrinterDemoApp {

    public static void main(String[] args) throws InterruptedException {

        ConsolePrinter cpA = new ConsolePrinter("printer A");
        ConsolePrinter cpB = new ConsolePrinter("printer B");
        ConsolePrinter cpC = new ConsolePrinter("printer C");
        ConsolePrinter cpD = new ConsolePrinter("printer D");

        //cpA.logic();
        //cpB.logic();

        System.out.println("constructor done");
        cpA.start();
        System.out.println("Thread A started");
        cpB.start();
        cpC.start();
        cpD.start();
        System.out.println("Thread B started");
        // warten
        System.out.println("waiting A");
        cpA.join();
        cpC.join();
        cpD.join();
        System.out.println("waiting B");
        cpB.join();

        System.out.println("all done");
    }
}
