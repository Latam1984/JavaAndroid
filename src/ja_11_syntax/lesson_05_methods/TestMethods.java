package ja_11_syntax.lesson_05_methods;

/**
 * Created by Aleksey on 27.02.2017.
 */
public class TestMethods {
    public static void main(String[] args) {
        int c = 2;
        int d = 3;
        sum(c,d);
        System.out.println(c);
    }

    public static int sum (int a, int b){
        int c = 1000;
        int sum = a+b;
        return sum;
    }


}
