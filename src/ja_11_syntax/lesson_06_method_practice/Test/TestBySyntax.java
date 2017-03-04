package ja_11_syntax.lesson_06_method_practice.Test;

/**
 * Created by Aleksey on 02.03.2017.
 * найти первое число которое идет в строгом порядке возростания
 */
public class TestBySyntax {
    public static void main(String[] args) {
        Integer[] arr = {21, 22, 211, 123, 124, 127, 12};
        for (int i = 0; i < arr.length; i++) {
            if (checkNumber(arr[i])==true){
            System.out.println(i);
            break;}
        }
    }

    private static boolean checkNumber(Integer arr) {
        String s = "";
        s = arr.toString();
        for (int i = 0; i < s.length() - 1; i++) {
            if ((int)s.charAt(i) >= (int) s.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
}

