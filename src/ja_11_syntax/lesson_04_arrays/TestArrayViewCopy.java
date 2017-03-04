package ja_11_syntax.lesson_04_arrays;

import java.util.Arrays;

/**
 * Created by Aleksey on 27.02.2017.
 */
public class TestArrayViewCopy {
    public static void main(String[] args) {
        int [] a= new int[10];

        for (int i = 0; i <a.length ; i++) {
            a[i] = i+1;
        }
        for (int i = 0; i < a.length ; i++) {
            System.out.println(a[i] + " ");
        }
        //copy array
        int []b = new int[a.length];

        //1.
        for (int i = 0; i <a.length ; i++) {
            b[i] = a[i];
        }
        System.out.println("b = " + Arrays.toString(b));

        //2.

        System.arraycopy(a, 0, b, 0, a.length);
        System.out.println(Arrays.toString(b));

        //3.
        int [] c = Arrays.copyOfRange(a,0,a.length + 10);
        System.out.println("c = " + Arrays.toString(c));
    }
}
