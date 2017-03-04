package ja_11_syntax.lesson_05_methods;

import java.util.Arrays;

/**
 * Created by Aleksey on 28.02.2017.
 */
public class TestArray2DSort {
    public static void main(String[] args) {
        int [] [] a = {{6,8,4},{9,2,8}};
        System.out.println(Arrays.deepToString(a));
        getSorted(a);
        System.out.println(Arrays.deepToString(a));
    }
    public static int [] [] getSorted(int[][] a){
        int [] [] result; //new int 1, 2
        result = Arrays.copyOf(a, a.length);
        Arrays.sort(result[0]);
        Arrays.sort(result[1]);
        return result;
    }
}
