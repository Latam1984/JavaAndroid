package ja_11_syntax.lesson_03;

import java.util.Scanner;

/**
 * Created by Aleksey on 24.02.2017.
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long f = 1;

        for (int i = 1; i <= n ; i++) {
            f *=i;
        }
        System.out.println(f);
        if (f < Long.MAX_VALUE){
            System.out.println("norm");
        } else
        System.out.println("max");

    }
}
