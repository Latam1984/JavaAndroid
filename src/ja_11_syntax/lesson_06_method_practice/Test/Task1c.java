package ja_11_syntax.lesson_06_method_practice.Test;

/**
 * Created by Aleksey on 01.03.2017.
 * Задана строка. Построить новую строку, в которой все символы
 * записаны в обратном порядке.
 */
public class Task1c {
    public static void main(String[] args) {
        String someString = "abc";
        String result = reverseString(someString);
        System.out.println(result);
        //===============================
        System.out.println(reverseString1(someString));

    }

    public static String reverseString(String someString) {
        char[] oldStringArray = someString.toCharArray();
        char[] arrayString = new char[oldStringArray.length];

        for (int i = 0; i < oldStringArray.length; i++) {
            arrayString[i] = oldStringArray[(oldStringArray.length - 1) - i];
        }
        return new String(arrayString);
    }
   public static String reverseString1 (String someString){
       return new StringBuilder(someString).reverse().toString();
   }

}
