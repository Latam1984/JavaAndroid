package ja_11_syntax.lesson_05_methods;

import java.util.Arrays;

/**
 * Created by Aleksey on 28.02.2017.
 */
public class TestVethodNotChangesObject {
    public static void main(String[] args) {
        int[] a = {6, 8, 2, 4, 5, 7};
        int[] sortedA = getSorted(a);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(sortedA));
    }

    public static int[] getSorted(int[] input) {

        int[] result = Arrays.copyOf(input, input.length);
        Arrays.sort(result);
        return result;
    }
}
