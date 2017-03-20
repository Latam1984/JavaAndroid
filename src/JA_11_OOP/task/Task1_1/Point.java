package JA_11_OOP.task.Task1_1;

/**
 * Created by Aleksey on 03.03.2017.
 */
public class Point {
    private double x,y;

    static double distance(Point p1, Point p2){
        double x = p1.x - p2.x;
        double y = p1.y - p2.y;
        return Math.sqrt((x*x+y*y));
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo(Point other){
        double x = this.x - other.x;
        double y = this.y - other.y;
        return Math.sqrt((x*x+y*y));
    }
}
