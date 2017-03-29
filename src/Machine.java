/**
 * Created by ABondarev on 22.03.2017.
 */
public class Machine {
    private boolean isOn;
    Machine(boolean isOn) {
        this.isOn = isOn;
    }

    public void turnOn() {
        System.out.println("Machine is on!");
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Machine is off");
    }

    boolean checkIsOn() {
        return isOn;
    }
}
