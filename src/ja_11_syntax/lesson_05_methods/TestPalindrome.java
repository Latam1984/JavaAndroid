package ja_11_syntax.lesson_05_methods;

/**
 * Created by Aleksey on 27.02.2017.
 */
public class TestPalindrome {
    public static void main(String[] args) {
        //Проверить является ли массив палиндромом
        int[] a = {1, 2, 3, 4, 3, 2, 1};

        boolean isPalindrome = true;
        for (int i = 0; i < a.length / 2; i++) {
            if (a[i] != a[a.length - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome(a));
    }

    public static boolean isPalindrome(int[] a) {
        //Проверить является ли массив палиндромом
        boolean isPalindrome = true;

        for (int i = 0; i < a.length / 2; i++) {
            if (a[i] != a[a.length - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }
}
