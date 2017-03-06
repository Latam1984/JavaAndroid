package JA_11_OOP.lesson_09_inheritance;

/**
 * Created by Aleksey on 06.03.2017.
 */
public class Circle extends Shape2D {
    private double radius;

    public Circle(String name, String color, double radius) {
        super(name, color);
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void show() {
        System.out.println(this.getColor() + " " + this.getName() + " " + "r = " + this.radius);
    }


}
