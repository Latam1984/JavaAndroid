package ja_11_syntax.lesson_03;

import java.util.Scanner;

/**
 * Created by Aleksey on 24.02.2017.
 */
public class TestIfElse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число 1 ");
        int a = sc.nextInt();
        System.out.println("Введите число 2 ");
        int b = sc.nextInt();
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        if (a < b) {
            System.out.println("a < b");
        } else {
            if (a > b) {
                System.out.println("a > b");
            } else {
                System.out.println("a = b");
            }
        }
    }
}
