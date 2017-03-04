package JA_11_OOP.lesson_07_oop_start.сar_example_class;

/**
 * Created by Aleksey on 02.03.2017.
 */
public class Car {
    private String name;
    private String color;
    private int year;
    private double speed;


public Car (String name, int year){
    this.name = name;
    this.year = year;
}

    public Car (){
        System.out.println("Car created");
        name = "no name";
    }

    public void accelerate(int delta) {
        speed += delta;
    }

    public void decelerate(int delta) {
        speed -= delta;
        if (speed < 0) speed = 0;
    }

    public double getSpeed() {
        return speed;
    }

    public void setName(String nm) {
        this.name = nm;
    }

    public void setYear(int y) {
        this.year = y;
    }

    public String getName() {
        return this.name;
    }

    public int getYear() {
        return this.year;
    }

    public void printInfo() {
        System.out.println(this.getName() + " " + this.getYear() + " " + this.speed);
    }
}
