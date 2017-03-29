/**
 * Created by Anatoliy on 29.03.2017.
 */
public class Scanner implements IMachine {

    @Override
    public void turnOn() {
        System.out.println("scanner");
    }

    @Override
    public void turnOff() {
        System.out.println("scanner");
    }

    @Override
    public boolean checkIsOn() {
        return false;
    }
}
