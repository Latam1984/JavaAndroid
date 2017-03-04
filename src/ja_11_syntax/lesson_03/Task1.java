package ja_11_syntax.lesson_03;

import java.util.Scanner;

/**
 * Created by Aleksey on 24.02.2017.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;
        for (int i = 0; i < n; i++) {
            System.out.println((i==0?" ":i) + "\t");
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(j*n);
            }
        }
    }
}

