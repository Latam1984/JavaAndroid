package JA_11_OOP.lesson_12_interface;

import java.util.Comparator;

/**
 * Created by Aleksey on 13.03.2017.
 */
public class ByYear implements Comparator <Book> {


    @Override
    public int compare(Book o1, Book o2) {
        return Integer.compare(o1.getYear(),o2.getYear());
    }
}
