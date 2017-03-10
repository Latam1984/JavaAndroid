package JA_11_OOP.lesson_09_inheritance;

/**
 * Created by Aleksey on 06.03.2017.
 */
public abstract class Shape {
    private String color;


    public Shape(String color) {
        this.color = color;
    }

    public abstract void show();

    public String getColor() {
        return color;
    }
}
