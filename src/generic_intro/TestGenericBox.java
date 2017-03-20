package generic_intro;

/**
 * Created by Aleksey on 20.03.2017.
 */
public class TestGenericBox {
    public static void main(String[] args) {
        //GenericBox <String> genericBox = new GenericBox<String>();
        GenericBox <String> box = new GenericBox<>();
        //box.setValue(new Integer(222)); //problem 1 solved! - type check!
        box.setValue("string");

        String str = box.getValue();//need no casting - problem 2 solved

       // Integer i1 = (Integer)box.getValue();// - cannot too!
    }
}
