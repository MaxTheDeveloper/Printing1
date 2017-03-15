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

    public boolean isOn() {
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

    public void print(){
        System.out.println(this.isOn + " " + getModelNumber());
    }

    public void print(String string){
        System.out.println(string);
    }
}
