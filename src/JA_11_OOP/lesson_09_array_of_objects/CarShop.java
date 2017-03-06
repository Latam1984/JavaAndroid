package JA_11_OOP.lesson_09_array_of_objects;

import java.time.LocalDate;
import java.util.Arrays;

/**
 * Created by Aleksey on 06.03.2017.
 */
public class CarShop {
    private Car[] cars;
    private int currentIndex;

    public CarShop(int count) {
        this.cars = new Car[count];
        this.currentIndex = -1;
    }

    public void add(Car car) {
        if (currentIndex == cars.length - 1) {
            System.out.println("Error add car. No place to add.");
            return;
        }
        currentIndex++;
        cars[currentIndex] = car;
    }

    public void printAll() {
        System.out.println(Arrays.toString(cars));
        for (Car car : cars) {
            System.out.println(car);
        }
//        for (int i = 0; i < cars.length; i++) {
//        System.out.println(cars[currentIndex]);
//        }
    }

    public void deleteCar(int index) {
        if (index < 0 || index > currentIndex) {
            System.out.println("Error delete car. Index out of bounds!");
            return;
        }
        cars[index] = cars[currentIndex];
        cars[currentIndex] = null;
        currentIndex--;

    }

    public Car getCarByName(String name) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getName().equals(name)) {
                return cars[i];
            }
        }
        System.out.println("Car wasn't find!");
        return null;
    }

    public void findCarByYear(int age) {
        int currentYear = LocalDate.now().getYear();
        for (int i = 0; i < cars.length; i++) {
            if (currentYear - cars[i].getYear() >= age) {
                System.out.println(cars[i]);
            }
        }
    }
    public Car findCarByName (String name){
        for (int i = 0; i < currentIndex; i++) {
            if (cars[i].equals(name))return cars[i];
        }
        System.out.println();
        return null;
    }
}

