package JA_11_OOP.lesson_07_oop_start.сar_example_class;

import JA_11_OOP.lesson_07_oop_start.сar_example_class.Car;

/**
 * Created by Aleksey on 02.03.2017.
 */
public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
//        car.name = "BMW";
//        car.year = 2004;

        car.setName("BMW");
        car.setYear(2009);
        car.getName();
        car.getYear();

//        System.out.println(car.name);
//        System.out.println(car.year);
        car.accelerate(60);
        car.decelerate(30);
        car.setName("BMW");
        car.setYear(2009);
        System.out.println(car.getSpeed());
        car.printInfo();

        Car car1 = new Car("Opel", 2011);
        car1.printInfo();
    }
}
