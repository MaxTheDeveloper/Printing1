/**
 * Created by MUtemov on 15.03.2017.
 */
public class Printer {
    boolean isOn;
    String modelNumber;

    public Printer(boolean isOn, String modelNumber) {
        this.isOn = isOn;
        this.modelNumber = modelNumber;
    }

    public boolean getIsOn() {
        return isOn;
    }

    public String getModelNumber() {
        return modelNumber;
    }


    @Override
    public String toString() {
        return "Printer{" +
                "isOn=" + isOn +
                ", modelNumber='" + modelNumber + '\'' +
                '}';
    }

    public void print() {
        if (isOn) {
            System.out.println("Принтер" + " " + getModelNumber() + " " + "включен");
        } else {
            System.out.println("Принтер" + " " + getModelNumber() + " " +"выключен!");
        }
    }

    public void print(String text) {
        System.out.println(text);
    }

    public void print(String text, int copies) {
        if (isOn) {
            for (int i = 0; i < copies; i++) {
                System.out.println(text + " " + copies);
            }
            System.out.println();
        }
    }

    public void printColors() {
        /*String[] colors = {"Red", "Green", "Blue"};
        for (String x : colors
                ) {
            System.out.println(x);
        }*/
        for (Colors c:Colors.values()
             ) {
            System.out.println(Colors.values());
        }
    }
}
