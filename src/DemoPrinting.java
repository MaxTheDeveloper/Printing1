/**
 * Created by MUtemov on 15.03.2017.
 */
public class DemoPrinting {
    public static void main(String[] args) {
        Printer printer = new Printer("Cannon mp320");
        printer.loadPaper(3);
        printer.print("text", 5);
        printer.printColors();
    }
}
