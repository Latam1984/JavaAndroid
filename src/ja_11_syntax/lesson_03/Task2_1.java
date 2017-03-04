package ja_11_syntax.lesson_03;

/**
 * Created by Aleksey on 24.02.2017.
 */
public class Task2_1 {
    public static void main(String[] args) {
        int n = 4;
        int length = 0;
        int delta = 1;

        for (int i = 1; i < 2*n ; i++) {
            length += delta;
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
            if (length == n) delta=--delta;
        }
    }
}
