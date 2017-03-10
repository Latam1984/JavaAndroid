package JA_11_OOP.polimorph_intro;

/**
 * Created by Aleksey on 09.03.2017.
 */
public class Test {
    public static void main(String[] args) {
        A a = new A();
        A b = new B(); // b Э A
        a.print();
        b.print();

        A [] arr = new A[3];
        arr [0] = new A();
        arr [1] = new B();
        arr [2] = new A();

        for (int i = 0; i < 3; i++) {
            arr[i].print();
        }

        for (int i = 0; i < 3; i++) {
            if (Math.random()>0.5) arr [i] = new A();
            else arr [i] = new B();

        }
    }
}
