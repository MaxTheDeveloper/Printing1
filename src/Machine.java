/**
 * Created by ABondarev on 22.03.2017.
 */
public class Machine {
    boolean isOn;
    Machine(boolean isOn) {
        this.isOn = isOn;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }
}
