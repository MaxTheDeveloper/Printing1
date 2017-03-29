/**
 * Created by MUtemov on 15.03.2017.
 */
public class DemoPrinting {
    public static void main(String[] args) {
        Printer printer = new Printer("Cannon mp320");
        Machine machine = new Machine(false);
        machine.turnOn();
        Machine machine1 = new Printer("Machine Printer");
        machine1.turnOn();
        machine1.turnOff();
        printer.loadPaper(3);
        printer.print("text", 5);
        printer.printColors();
    }
}
