package JA_11_OOP.Lesson_12_numbers;

/**
 * Created by Aleksey on 13.03.2017.
 */
public class Complex implements Addable<Complex> {
    private double a;
    private double b;


    public Complex() {
    }

    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Complex plus(Complex other) {
        return new Complex(this.a + other.b, this.b + other.b);
    }

    @Override
    public Complex minus(Complex other) {
        return new Complex(this.a + other.a, this.b + other.b);
    }

    @Override
    public String toString() {
        return "Complex{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
