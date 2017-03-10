package JA_11_OOP.lesson_10_abstract;

/**
 * Created by Aleksey on 09.03.2017.
 */
public abstract class Point {
    private String color;

    public Point(String color) {
        this.color = color;
    }
    public abstract void show ();
}
