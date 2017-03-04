package ja_11_syntax.lesson_04_arrays;

import java.util.Arrays;

/**
 * Created by Aleksey on 27.02.2017.
 */
public class TestArray01 {
    public static void main(String[] args) {
        int [] a = new int[10];
        int [] b = {2,5,7,9,11,13,14,15,16,19};

        double [] c;
        c = new double[]{1,2,3,5,5.5};
        System.out.println("c2 = " + c[2]);
        System.out.println(c); // ссылка
        System.out.println(Arrays.toString(b));
        c[0] = 555;
        System.out.println(c[0]);
    }
}
