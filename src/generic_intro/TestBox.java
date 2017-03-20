package generic_intro;

/**
 * Created by Aleksey on 20.03.2017.
 */
public class TestBox {
    public static void main(String[] args) {
        Box box = new Box();
        box.setValue("string");
        //1. a lot of downcasting
        String str = (String) box.getValue();

        //2. may cause type mismatch
        box.setValue(new Integer(222));
        String str2 = (String) box.getValue();
    }
}
