package ja_11_syntax.lesson_06_method_practice.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Aleksey on 05.03.2017.
 * С помощью функции random() сгенерировать массив чисел от 0 до 50 и
 * определить количество четных и нечетных чисел в этом массиве. Для
 * определения четных и нечетных чисел использовать функцию.
 */
public class Task2b {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int sumEvenNumber = checkArray(arr);
        int sumNotEvenNumber = arr.length - sumEvenNumber;
        System.out.println("Even numbers in array: " + sumEvenNumber + "\n" + "Not even numbers in array: " + sumNotEvenNumber);
    }

    private static int checkArray( int [] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (20 + Math.random() * 50);
            if (arr [i] %2 == 0)
                count++;
        }

        System.out.println(Arrays.toString(arr));
        return count;
    }
}
