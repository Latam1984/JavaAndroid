package JA_11_OOP.lesson_09_array_of_objects;

/**
 * Created by Aleksey on 06.03.2017.
 */
public class Car {
    private String name;
    private int year;
    private int maxSpeed;

    public Car(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public Car(String name, int year, int maxSpeed) {
        this.name = name;
        this.year = year;
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
