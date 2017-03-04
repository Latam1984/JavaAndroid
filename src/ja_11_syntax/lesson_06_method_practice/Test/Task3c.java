package ja_11_syntax.lesson_06_method_practice.Test;

/**
 * Created by Aleksey on 01.03.2017.
 * В заданной строке удалить первый символ « », который найдется в
 * строке.
 */
public class Task3c {
    public static void main(String[] args) {
        String someString = "ht tp s";
        System.out.println(deleteFirstSpace(someString));
    }

    private static String deleteFirstSpace(String someString) {
//        char[] arr = someString.toCharArray();
//        char[] resultArr = new char[arr.length - 1];
//        System.out.println(arr.length);
//        System.out.println(someString.indexOf(" "));

        String resultString = someString.substring(0, 2) + someString.substring(3, 7);
        return resultString;
    }
//второй метод не работает
    private static String deleteFirstSpace2 (String someString){
        char[] arr = someString.toCharArray();
        System.out.println(someString.indexOf(" "));
       // arr[someString.indexOf(" ")]= '';

        return null;

    }
}
