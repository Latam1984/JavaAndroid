package ja_11_syntax.lesson_06_method_practice.Test;

/**
 * Created by Aleksey on 01.03.2017.
 * В заданной строке удалить последний символ « » (пробел), который
 найдется в строке.
 */
public class Task4c {
    public static void main(String[] args) {
        String someString = "ht tp s";
        System.out.println(deleteFirstSpace(someString));
    }

    private static String deleteFirstSpace(String someString) {
        char[] arr = someString.toCharArray();
        System.out.println(arr.length);
        System.out.println(someString.lastIndexOf(" "));

        String resultString = someString.substring(0, 5) + someString.substring(6, 7);
        return resultString;
    }
    }

