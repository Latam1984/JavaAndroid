package ja_11_syntax.lesson_03;

import java.util.Scanner;

/**
 * Created by Aleksey on 24.02.2017.
 */
public class TestFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input N: ");
        int n = sc.nextInt();
        for (int i = n; i > 0; i--) {
            System.out.println(i);
        }
        for (int i = n, j = 2*n; i > 0 && j > 0; i--, j*=2) {
            System.out.println(i+ " " + j);
        }
    }
}
