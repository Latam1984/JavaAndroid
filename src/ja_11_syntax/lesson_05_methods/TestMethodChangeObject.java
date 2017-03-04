package ja_11_syntax.lesson_05_methods;

import java.util.Arrays;

/**
 * Created by Aleksey on 28.02.2017.
 */
public class TestMethodChangeObject {
    public static void main(String[] args) {
        int[] a = {8, 1, 4, 9, 0, 1, 3, 5, 7,};
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int[] a) {
        Arrays.sort(a);
    }
}
