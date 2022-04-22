package threading01;

public class ConsolePrinterDemoApp {

    public static void main(String[] args)  {

        ConsolePrinter cpA = new ConsolePrinter("printer A");
        ConsolePrinter cpB = new ConsolePrinter("printer B");

        cpA.logic();
        cpB.logic();
    }
}
