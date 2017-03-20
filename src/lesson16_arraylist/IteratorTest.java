package lesson16_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Aleksey on 20.03.2017.
 */
public class IteratorTest {
    public static void main(String[] args) {
        //constructor of collection can get another collection!!!
        List<Integer> list = new ArrayList<>(Arrays.asList(11,12,12,22,23,24,31,42,45,27));
        Iterator <Integer> iterator;
        iterator = list.iterator();
        System.out.println(iterator);
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        iterator = list.iterator();
        //want to dell ellement 23
        Integer tmp = iterator.next();
        while (iterator.next() == 23){
            iterator.remove();
        }
        System.out.println(list);
    }

}
