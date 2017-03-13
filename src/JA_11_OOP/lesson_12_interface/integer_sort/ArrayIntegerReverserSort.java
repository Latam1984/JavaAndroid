package JA_11_OOP.lesson_12_interface.integer_sort;

import java.util.Arrays;

/**
 * Created by Aleksey on 13.03.2017.
 */
public class ArrayIntegerReverserSort {
    public static void main(String[] args) {
        Integer [] a = {1,2,3,4,2,7,1,5,7,2,8,11,3,4};
        Arrays.sort(a);

        Integer [] a1 = new Integer[a.length];
        for (int i = 0; i <a.length ; i++) {
            a1[i] = new Integer(a[i]);
        }


        System.out.println(Arrays.toString(a));
        Arrays.sort(a, new ReversedInteger());
    }
}
