package JA_11_OOP.lesson_09_array_of_objects;

/**
 * Created by Aleksey on 06.03.2017.
 */
public class CarTest {
    public static void main(String[] args) {
        //Car [] cars = new Car[5];
//        cars [0] = new Car("BMW", 2007);
//        cars [1] = new Car("Audi", 2015);
//        cars [2] = new Car("Opel", 2011);
//        cars [3] = new Car("Subaru", 2016);
//        cars [4] = new Car("Jeep", 2017);

        CarShop carShop = new CarShop(10);
        carShop.add(new Car("BMW", 2007));
        carShop.add(new Car("Audi", 2015));
        carShop.add(new Car("Opel", 2011));
        carShop.add(new Car("Subaru", 2016));
        carShop.add(new Car("Jeep", 2017));

        carShop.printAll();
        carShop.deleteCar(1);
        System.out.println("After delete: ");
        carShop.printAll();

        System.out.println("Print car older then 10 years");
        carShop.findCarByYear(2);

    }
}
