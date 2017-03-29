/**
 * Created by MUtemov on 15.03.2017.
 * Anatoliy on 22.03.2017
 */
public class Printer implements IMachine {
    private String modelNumber;
    private PaperTray paperTray = new PaperTray();
    IMachine iMachine;

    public Printer(String modelNumber) {
        this.modelNumber = modelNumber;
        iMachine = new Machine(true);
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
    public boolean checkIsOn() {
            return iMachine.checkIsOn();
    }



    @Override
    public void turnOn() {
        iMachine.turnOn();
        System.out.println("Machine is on!");
    }

    @Override
    public void turnOff() {
        iMachine.turnOff();
        System.out.println("Machine is off");
    }

    @Override
    public String toString() {
        return "Printer{" +
                "isOn=" + checkIsOn() +
                ", modelNumber='" + modelNumber + '\'' +
                '}';
    }
}
