/**
 * Created by Maxim on 22.03.2017.
 */
public enum Colors {
    RED("Red",0xff0000),GREEN("Green",0x00ff00) ,BLUE("Blue",0x0000ff);
    Colors(String color,int code){
    }

    @Override
    public String toString() {
        return String.valueOf(Colors.values());
    }
}
