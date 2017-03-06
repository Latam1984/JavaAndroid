package ja_11_syntax.lesson_06_method_practice.Test;

import java.util.Scanner;

/**
 * Created by Aleksey on 05.03.2017.
 * Перевести заданное в десятичной системе число a в восьмеричную
 систему, используя функцию перевода .
 */
public class Task3b {
    public static void main(String[] args) {
        System.out.println("Please, enter some number: ");
        Scanner sc = new Scanner(System.in);
        binaryNumbers(sc.nextInt());
    }

    private static void binaryNumbers(int number) {
        String binString = Integer.toBinaryString(number);
        System.out.println(binString);
    }
}
