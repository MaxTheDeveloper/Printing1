/**
 * Created by MUtemov on 15.03.2017.
 */
public class DemoPrinting {
    public static void main(String[] args) {
        Printer printer = new Printer("Cannon mp320");
        Machine machine = new Machine(true);
        printer.loadPaper(3);
        printer.print("text", 5);
        printer.printColors();
        Scanner scanner = new Scanner();
        scanner.turnOn();
        scanner.turnOff();
    }
}
