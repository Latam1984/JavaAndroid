package JA_11_OOP.hiding_fields;

/**
 * Created by Aleksey on 09.03.2017.
 */
public class B extends A {
    private int a = 5;

    public void printA(){
        System.out.println(super.a + " " + this.a);
    }

    public static void main(String[] args) {
        new B().printA();
    }
}
