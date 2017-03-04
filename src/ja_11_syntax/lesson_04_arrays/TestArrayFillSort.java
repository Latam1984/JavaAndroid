package ja_11_syntax.lesson_04_arrays;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Aleksey on 27.02.2017.
 */
public class TestArrayFillSort {
    public static void main(String[] args) {
        //fill this 1
        Integer [] a = new Integer[10];
        Arrays.fill(a,1);
        Arrays.toString(a);

        //fill with random value

        for (int i = 0; i < a.length ; i++) {
         a[i] = (int)(20 + Math.random() * 80);
        }
        System.out.println(Arrays.toString(a));

        //sort

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        //
        Arrays.sort(a, new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                return -Integer.compare(i1,i2);
            }
        });
    }
}
