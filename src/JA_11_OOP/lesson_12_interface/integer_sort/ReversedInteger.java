package JA_11_OOP.lesson_12_interface.integer_sort;

import java.util.Comparator;

/**
 * Created by Aleksey on 13.03.2017.
 */
public class ReversedInteger implements Comparator <Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return Integer.compare(o1,o2);
    }
}
