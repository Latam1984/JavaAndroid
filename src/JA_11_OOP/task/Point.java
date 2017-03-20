package JA_11_OOP.task;

/**
 * Created by Aleksey on 03.03.2017.
 */
public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    private void distanceTo(Point someOtherPoint) {
        //   double distance = Math.sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));
        double distance = Math.sqrt(Math.pow(this.x - someOtherPoint.x, 2) + Math.pow(this.y - someOtherPoint.y, 2));
        System.out.println("Distance1: " + distance);
    }

    private static boolean distance(Point someOtherPoint1, Point someOtherPoint2) {
        double distance = Math.sqrt(Math.pow(someOtherPoint1.x - someOtherPoint2.x, 2) + Math.pow(someOtherPoint1.y - someOtherPoint2.y, 2));
        if (distance == 0) {
            return true;
        } else
            return false;
    }

    //дежат ли точки на одной прямой
    private boolean lineOrNot(Point point1, Point point2) {
        //d = sqrt ((x1-x2)2 + (y1-y2)2)
        if ((x - point1.getX() * (point1.getY() - point2.getY() - (point1.getX() - point2.getY() * (y - point2.getY()))))== 0)
            return true;
        else return false;
    }
}
