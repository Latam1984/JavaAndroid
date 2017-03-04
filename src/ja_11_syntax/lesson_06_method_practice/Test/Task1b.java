package ja_11_syntax.lesson_06_method_practice.Test;

/**
 * Created by Aleksey on 02.03.2017.
 * Проверить строку на правильность скобок ()()(((())))
 */
public class Task1b {
    public static void main(String[] args) {
        String someString = "dj(oo) ().... ()()()";

        check(someString);
    }

    private static boolean check(String someString) {
        char [] arr = someString.toCharArray();
        for (int i = 0; i <arr.length ; i++) {

        }

        return false;
    }
}
