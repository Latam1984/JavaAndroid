package lesson16_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Aleksey on 20.03.2017.
 */
public class TestArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
list.add(111);
list.add(222);
list.add(333);
list.add(444);

        System.out.println(list);
        System.out.println(list.get(0));
        list.set(3, 888);
        System.out.println(list);

        list.remove(0);
        System.out.println(list);
        list.add(5);
       // list.remove(5);//new Integer (5)
        System.out.println(list);
        list.remove(new Integer(5));// remove first instance
        System.out.println(list);

        System.out.println("pos of 333 = "+list.indexOf(333));

        list.addAll(Arrays.asList(444,555,666,777,888,999));
        System.out.println(list);
    }
}
