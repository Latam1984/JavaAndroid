package ja_11_syntax.lesson_03;

/**
 * Created by Aleksey on 24.02.2017.
 */
public class TestBreak {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            if (i == 3) {
                System.out.println(i);
                continue;
            }
            if (i == 7) {
                break;
            }
        }
    }
}

