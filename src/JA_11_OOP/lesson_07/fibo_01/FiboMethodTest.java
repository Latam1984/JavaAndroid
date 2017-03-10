package JA_11_OOP.lesson_07.fibo_01;

import java.util.Arrays;

/**
 * Created by Aleksey on 06.03.2017.
 */
public class FiboMethodTest {
    //fibonache numbers
    public static void main(String[] args) {
        int n = 6;
        System.out.println(Arrays.toString(fibo(6)));
        }

    static int [] fibo (int n){
        int [] arr = new int[n];
        int a1 = 1, a2 = 0;
        int a3;

        for (int i = 0; i < n; i++){
        a3=a1+a2;
        System.out.println(a3);
        arr[i] = a3;
        a1=a2;
        a2=a3;
        }
        return arr;
}
}
