package JA_11_OOP.lesson_10_abstract;

/**
 * Created by Aleksey on 09.03.2017.
 */
public class Point2D extends Point1D {
    protected double y;

    public Point2D(String color, double x, double y) {
        super(color, x);
        this.y = y;
    }

    @Override
    public void show() {
        System.out.println("{2Dpoint: " + x + " " + y );
    }
}
