/**
 * Created by MUtemov on 15.03.2017.
 * Anatoliy on 22.03.2017
 */
public class Printer extends Machine {
    private String modelNumber;
    private PaperTray paperTray = new PaperTray();

    public Printer(String modelNumber) {
        super(true);
        this.modelNumber = modelNumber;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void loadPaper(int count) {
        paperTray.addPaper(count);
    }

    public void print() {
        if (checkIsOn()) {
            System.out.println("Принтер " + getModelNumber() + " включен");
        } else {
            System.out.println("Принтер " + getModelNumber() + " выключен!");
        }
    }

    public void print(String text, int copies) {
        for (int i = 0; i < copies; i++) {
            if(!paperTray.isEmpty()) {
                paperTray.usePage();
                System.out.println(text);
            }
            else
                continue;
        }
        if (paperTray.isEmpty()) {
                System.out.println("There is no paper");
            }
        else
            System.out.println("Принтер " + getModelNumber() + " выключен, печать невозможна");
    }

    public void printColors() {
        for (Colors c:Colors.values()
             ) {
            System.out.println(c);
        }
    }

    @Override
    public String toString() {
        return "Printer{" +
                "isOn=" + checkIsOn() +
                ", modelNumber='" + modelNumber + '\'' +
                '}';
    }
}
