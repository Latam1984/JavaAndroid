package JA_11_OOP.lesson_10_abstract;

/**
 * Created by Aleksey on 09.03.2017.
 */
public class Test {
    public static void main(String[] args) {
        Point1D[] points = new Point1D[3];
        points[0] = new Point1D("red", 1);
        points[1] = new Point2D("red", 1, 2);
        points[2] = new Point3D("red", 1, 2, 3);
        for (Point1D p : points) {
            p.show();
        }
    }
}
