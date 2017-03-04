package JA_11_OOP.StaticNonStatic;

/**
 * Created by Aleksey on 03.03.2017.
 */

    //class - static
    //instance - non-static - object

public class TestPerson {
    public static void main(String[] args) {
        Person person1 = new Person("Tom", 33);
       // person1.printInfoAboutClass(); //baaaaaaaaaad!!!!!!!!!

        Person.printInfoAboutClass();

    }
}
