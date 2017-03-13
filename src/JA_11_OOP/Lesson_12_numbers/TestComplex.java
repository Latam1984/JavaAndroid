package JA_11_OOP.Lesson_12_numbers;

/**
 * Created by Aleksey on 13.03.2017.
 */
public class TestComplex {
    public static void main(String[] args) {
        Complex complex1 = new Complex(3, 5);
        Complex complex2 = new Complex(7, 3);
        Complex complex3 = new Complex(4, 2);
        System.out.println(add(new Number(3), new Number(2)));

        System.out.println(complex1.minus(complex3).plus(complex2));
    }

    public static Addable<Complex> add(Addable a, Addable b) {
        return (Addable) a.plus(b);
    }

}
