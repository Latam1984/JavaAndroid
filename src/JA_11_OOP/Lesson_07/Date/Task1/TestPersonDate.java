package JA_11_OOP.Lesson_07.Date.Task1;

import java.text.ParseException;
import java.util.Date;

/**
 * Created by Aleksey on 06.03.2017.
 */
public class TestPersonDate {
    public static void main(String[] args) throws ParseException {
        Person p1 = new Person("John", new Date("12.12.2012"));
        Person p2 = new Person("Tomy", new Date("11.11.2011"));
        System.out.println(p1);
        System.out.println(p2);

        Date tmp = p2.getBirthDate();
    }
}
