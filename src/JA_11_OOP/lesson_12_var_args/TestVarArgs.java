package JA_11_OOP.lesson_12_var_args;

/**
 * Created by Aleksey on 14.03.2017.
 */
public class TestVarArgs {
    public static void main(String[] args) {
        System.out.println(sum(2, 3));
        System.out.println(sum(2, 3, 4));
        System.out.println(sum("varargs", 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println(sum(new int[]{2, 3, 4, 5, 6, 7, 8, 9}));

    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static int sum(int[] a) {
        int sum = 0;
        for (int value : a) {
            sum += value;
        }
        return sum;
    }

    static int sum(String s, int... a) {//(int ... a, String s) - NOT!!!
        //(int ...a, String...s) - NOT!!!
        int sum = 0;
        for (int value : a) {
            sum += value;
        }
        return sum;
    }
}
