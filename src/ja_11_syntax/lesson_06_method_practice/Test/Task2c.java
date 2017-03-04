package ja_11_syntax.lesson_06_method_practice.Test;

/**
 * Created by Aleksey on 01.03.2017.
 * Построить строку, состоящую из малых букв латинского алфавита (по
 алфавиту).
 */
public class Task2c {
    public static void main(String[] args) {
        alphabet();
    }

    private static void alphabet() {
        for (char i = 'a'; i <='z' ; i++) {
            System.out.print(" " + i);
        }
    }
}
