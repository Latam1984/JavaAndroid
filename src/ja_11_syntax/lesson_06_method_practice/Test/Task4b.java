package ja_11_syntax.lesson_06_method_practice.Test;

/**
 * Created by Aleksey on 05.03.2017.
 * Дан массив целых чисел A. Найти суммы положительных и отрицатель-
 ных элементов массива, используя функцию определения суммы
 */
public class Task4b {
    public static void main(String[] args) {
        //находим колтчество положительных и отрицательных элементов
        int [] arr = {1,2,-3,5,6,7,9,-1, -3, -6};
       int minusCounter  = findNumbers(arr);
        int countNumber = arr.length - minusCounter;
        System.out.println("Minus elements of arrays = " + minusCounter);
        System.out.println("Positive elements of arrays = " + countNumber);
        System.out.println("Sum minus numbers = " + minusSumOfNumbers(arr));
    }

    private static int findNumbers(int [] arr) {
        int minusCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                minusCount++;
            }
        }
        return minusCount;
    }

    public static int minusSumOfNumbers (int [] arr) {
        int minusSum = 0;
        int positiveNumbers = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0){
                minusSum = minusSum + arr[i];
            } else positiveNumbers = positiveNumbers + arr[i];
        }
        System.out.println("Sum of positive numbers = " + positiveNumbers);
        return minusSum;
    }

}
