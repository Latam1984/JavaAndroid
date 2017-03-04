package ja_11_syntax.lesson_06_method_practice;

import java.util.Scanner;

/**
 * Created by Aleksey on 01.03.2017.
 */
public class TestScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
           // String s = scanner.next(); // считывает до пробела
          //  System.out.println(s);
            String s1 = scanner.nextLine(); //считывает всю строку
            System.out.println(s1);
        }
    }
}
