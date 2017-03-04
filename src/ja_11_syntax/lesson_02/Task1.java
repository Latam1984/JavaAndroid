package ja_11_syntax.lesson_02;

/**
 * Created by Aleksey on 23.02.2017.
 */
public class Task1 {
    public static void main(String[] args) {
        //узнать частное от деления и остаток от деления
        // 2 в 32-й степени
//        int a= 2;
//        int b = 32;
//
//        System.out.println((int)Math.pow(a, b)/641);
//        System.out.println(Math.pow(a, 32)/641);
//        System.out.println();

        long d = (long) Math.pow(2,32) + 1;
        int mod;
        int result;

        result = (int) (d/641);
        mod = (int) (d%641);
        System.out.println(mod);
        System.out.println(result);
    }
}
