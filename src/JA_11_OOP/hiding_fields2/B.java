package JA_11_OOP.hiding_fields2;

/**
 * Created by Aleksey on 09.03.2017.
 */
public class B extends A {
    private int a = 5;

    public static void main(String[] args) {
        new B().printA();
    }
}
