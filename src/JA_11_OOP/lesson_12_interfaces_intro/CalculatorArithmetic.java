package JA_11_OOP.lesson_12_interfaces_intro;

/**
 * Created by Aleksey on 13.03.2017.
 */
public class CalculatorArithmetic implements Arithmetic {
    @Override
    public double div(double a, double b) {
        return a / b;
    }

    @Override
    public double mult(double a, double b) {
        return a * b;
    }

    @Override
    public double plus(double a, double b) {
        return a + b;
    }

    @Override
    public double minus(double a, double b) {
        return a - b;
    }
}
