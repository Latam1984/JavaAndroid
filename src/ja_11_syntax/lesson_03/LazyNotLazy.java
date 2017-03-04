package ja_11_syntax.lesson_03;

/**
 * Created by Aleksey on 24.02.2017.
 */
public class LazyNotLazy {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        if (b == 1 || 1/a == 0){ //условие 2 не проверяется т.кю условие = true
            System.out.println("ok");
        }
        if (b ==0 && 1/a == 0){ //условие два не проверяется т.к. усдовие 1 = false
            System.out.println("ok1");
        }else {
            System.out.println("ok2");
        }
    }
}
