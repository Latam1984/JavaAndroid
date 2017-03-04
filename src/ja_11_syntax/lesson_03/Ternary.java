package ja_11_syntax.lesson_03;

/**
 * Created by Aleksey on 24.02.2017.
 */
public class Ternary {
    public static void main(String[] args) {
        int a;
        int b = 1;
        if (b == 0) {
            a = 1;
        } else {
            a = 2;
        }

        a = b == 0 ? 1 : 2;
    }
}
