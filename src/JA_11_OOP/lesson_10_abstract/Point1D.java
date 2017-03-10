package JA_11_OOP.lesson_10_abstract;

/**
 * Created by Aleksey on 09.03.2017.
 */
public class Point1D extends Point {
    protected double x;


    public Point1D(String color, double x) {
        super(color);
        this.x = x;
    }

    @Override
    public void show() {
        System.out.println("{1DPoint = " + x + "}");
    }

//    public void show() {
//        System.out.println("{1DPoint = " + x + "}");
//    }
}
