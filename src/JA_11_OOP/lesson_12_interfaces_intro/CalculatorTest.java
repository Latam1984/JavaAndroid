package JA_11_OOP.lesson_12_interfaces_intro;

/**
 * Created by Aleksey on 13.03.2017.
 */
public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Arithmetic calculator2 = new Calculator();


        System.out.println(calculator.mult(2, 3));
        calculator.printInfo();
        System.out.println(calculator2.plus(4, 3));
        ((Info) calculator2).printInfo();

        System.out.println(((Arithmetic)calculator2).plus(2,2));
    }

}
