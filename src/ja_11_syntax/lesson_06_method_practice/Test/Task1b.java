package ja_11_syntax.lesson_06_method_practice.Test;

/**
 * Created by Aleksey on 02.03.2017.
 * Проверить строку на правильность скобок ()()(((())))
 */
public class Task1b {
    public static void main(String[] args) {
        String someString = "()())";

        System.out.println(check(someString));
    }

    private static boolean check(String someString) {
        char[] arr = someString.toCharArray();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            String charCheck = someString.substring(i, i+1);
            if (charCheck.equals("(")) {
                count++;
            } else if (charCheck.equals(")")) {
                count--;
            }
        }
        if (count == 0) {
            return true;
        } else return false;
    }
}
