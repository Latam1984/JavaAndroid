package JA_11_OOP.lesson_12_numbers;

/**
 * Created by Aleksey on 13.03.2017.
 */
public class Number implements Addable<Number> {
    private double value;

    public Number(double value) {
        this.value = value;
    }

    @Override
    public Number plus(Number other) {
        return new Number(this.value + other.value);
    }

    @Override
    public Number minus(Number other) {
        return new Number(this.value - other.value);
    }

//    public Number plus(Number other) {
//        return new Number(this.value + other.value);
//    }
//
//    public Number minus(Number other) {
//        return new Number(this.value - other.value);
//    }

    @Override
    public String toString() {
        return "Number{" +
                "value=" + value +
                '}';
    }

}
