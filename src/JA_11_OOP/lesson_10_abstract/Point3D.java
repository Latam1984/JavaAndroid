package JA_11_OOP.lesson_10_abstract;

/**
 * Created by Aleksey on 09.03.2017.
 */
public class Point3D extends Point2D {
    private double z;

    public Point3D(String color, double x, double y, double z) {
        super(color, x, y);
        this.z = z;
    }

    @Override
    public void show() {
        System.out.println("{3DPoint " + x + " " + y + " " + z);
    }
}
