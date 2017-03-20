package generic_intro;

/**
 * Created by Aleksey on 20.03.2017.
 */
public class GenericBox <T> {//<T,E>
    private  T value;
   // private  E value2;
    private T [] values;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
