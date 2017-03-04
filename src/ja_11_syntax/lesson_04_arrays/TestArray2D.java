package ja_11_syntax.lesson_04_arrays;

import java.util.Arrays;

/**
 * Created by Aleksey on 27.02.2017.
 */
public class TestArray2D {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3};
        int[] a2 = {1, 2, 3};
        int[] a3 = {1, 2, 3};
        int[][] b = {a1, a2, a3};

        System.out.println(Arrays.toString(b[0]));


        int[][] c = new int[3][4];
        System.out.println(Arrays.toString(c));

        //print1
        for (int i = 0; i < c.length; i++) {
            System.out.println(Arrays.toString(c[i]));
        }
        //print2
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.println(c[i][j] + " ");
            }
            System.out.println();
        }
        //print3
        System.out.println(Arrays.deepToString(c));
    }
}
