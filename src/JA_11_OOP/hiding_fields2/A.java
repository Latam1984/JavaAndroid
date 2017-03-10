package JA_11_OOP.hiding_fields2;

/**
 * Created by Aleksey on 09.03.2017.
 */
public class A {
    private int a = 10;

    public void printA(){
        System.out.println(this.getClass().getSimpleName());
        System.out.println(this.a);
    }
}
