/**
 * Created by MUtemov on 15.03.2017.
 * Anatoliy on 22.03.2017
 */
public class Printer extends Machine {
    private String modelNumber;

    public Printer(String modelNumber) {
        super(true);
        this.modelNumber = modelNumber;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    @Override
    public String toString() {
        return "Printer{" +
                "isOn=" + checkIsOn() +
                ", modelNumber='" + modelNumber + '\'' +
                '}';
    }

    public void print() {
        if (checkIsOn()) {
            System.out.println("Принтер " + getModelNumber() + " включен");
        } else {
            System.out.println("Принтер " + getModelNumber() + " выключен!");
        }
    }

    public void print(String text, int copies) {
        if (checkIsOn()) {
            for (int i = 0; i < copies; i++) {
                System.out.println(text + " " + i);
            }
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
}
