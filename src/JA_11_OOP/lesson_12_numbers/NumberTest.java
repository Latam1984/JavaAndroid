package JA_11_OOP.lesson_12_numbers;

/**
 * Created by Aleksey on 13.03.2017.
 */
public class NumberTest {
    public static void main(String[] args) {
        Number a = new Number(8);
        Number b = new Number(5);
        Number c = new Number(13);

        Number d = a.plus(b).minus(c).plus(a);
        System.out.println(d);

        Number e = a.minus(c.minus(b));
        System.out.println(e);
    }
}
