package ja_11_syntax;

/**
 * Created by Aleksey on 23.02.2017.
 */
public class Test {
    public static void main(String[] args) {

        for (int i = 1; i < 25; i++) {
            if (i== 1 || i == 5 || i == 7 || i == 9 || i == 13 || i == 17 || i == 19 || i == 21 || i == 25)
            {
                System.out.print(" * ");
            } else {
                System.out.print(" " + i + " ");
            }
        }
    }
}
