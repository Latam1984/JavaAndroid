package ja_11_syntax.lesson_03;

/**
 * Created by Aleksey on 24.02.2017.
 */
public class RectanglePrint {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
