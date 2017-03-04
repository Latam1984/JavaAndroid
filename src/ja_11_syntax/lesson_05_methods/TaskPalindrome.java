package ja_11_syntax.lesson_05_methods;

/**
 * Created by Aleksey on 28.02.2017.
 */
public class TaskPalindrome {
    public static void main(String[] args) {
        boolean b = palindrome(12321);
       // palindrome();
    }

    private static boolean palindrome(int a) {
        char [] chars = Integer.toString(a).toCharArray();
        boolean isPalindrome = true;
        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }
}
