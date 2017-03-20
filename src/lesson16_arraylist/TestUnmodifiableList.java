package lesson16_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Aleksey on 20.03.2017.
 */
public class TestUnmodifiableList {
    public static void main(String[] args) {
        //aim - immutable list of 1,2,3
//        final Integer [] array = new Integer[2];
//        array[0] = 9;

        List<Integer> first = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> immutableList = Collections.unmodifiableList(first);
//        immutableList.add(222);
       // immutableList.set(0,10);// unsuported
        System.out.println(immutableList);
        //BUT
        first.set(0,0);
        System.out.println(immutableList);
        first.add(1000);
        System.out.println(immutableList);

        //"true" immutable list from list "first"

        List<Integer> trueImmutable = Collections.unmodifiableList(new ArrayList<>(first));
        System.out.println(trueImmutable);
        first.add(2000);
        System.out.println("first = " + first);
        System.out.println("TrueImmutable = " + trueImmutable);
    }
}
