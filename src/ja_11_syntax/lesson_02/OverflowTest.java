package ja_11_syntax.lesson_02;

/**
 * Created by Aleksey on 22.02.2017.
 */
public class OverflowTest {
    public static void main(String[] args) {
        int x = Integer.MAX_VALUE;
        System.out.println("before " + x);
        x = x + 1;
        System.out.println("after " + x);

        double d = Double.MAX_VALUE;
        System.out.println("before: " + d);
        d = d + Double.MAX_VALUE;
        System.out.println("after+: " + d);
       // System.out.println(Double.MIN_VALUE);//0+
        double d1 = Double.MAX_VALUE;
        d1 = d1-d1*3;
        System.out.println("after - : " + d1);

        //================================
        System.out.println(Math.sqrt(-1));//NaN
        System.out.println(Math.log(-2));
        System.out.println(Math.asin(1.1));


    }
}
