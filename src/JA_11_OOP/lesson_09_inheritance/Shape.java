package JA_11_OOP.lesson_09_inheritance;

/**
 * Created by Aleksey on 06.03.2017.
 */
public class Shape {
    private String color;


    public Shape(String color) {
        this.color = color;
    }

    public void show(){
        System.out.println(color);
    }

    public String getColor() {
        return color;
    }
}
