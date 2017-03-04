package ja_11_syntax.lesson_03;

import java.util.Scanner;

/**
 * Created by Aleksey on 24.02.2017.
 */
public class TestWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите N :");
        int n = sc.nextInt();
        int i = 0;

        while (i <=10){
            System.out.println(i);
            i++;
        }


        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (j < n);
    }
}
