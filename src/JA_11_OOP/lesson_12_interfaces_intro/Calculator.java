package JA_11_OOP.lesson_12_interfaces_intro;

/**
 * Created by Aleksey on 13.03.2017.
 */
public class Calculator implements OperationsAdd, OperationsMult, Info, Arithmetic {
    @Override
    public void printInfo() {
        System.out.println("Calculator 2.0");
    }

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
