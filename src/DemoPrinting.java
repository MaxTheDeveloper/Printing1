/**
 * Created by MUtemov on 15.03.2017.
 */
public class DemoPrinting {
    public static void main(String[] args) {
        Printer printer = new Printer("Cannon mp320");
        printer.print();
        printer.print("text", 3);
        printer.turnOff();
        printer.print("text", 3);
        printer.printColors();
    }
}
