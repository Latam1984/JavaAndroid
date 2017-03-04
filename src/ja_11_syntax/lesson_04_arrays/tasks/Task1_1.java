package ja_11_syntax.lesson_04_arrays.tasks;

import java.util.Arrays;

/**
 * Created by Aleksey on 27.02.2017.
 */
public class Task1_1 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length-1-i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
