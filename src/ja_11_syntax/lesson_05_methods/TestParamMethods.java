package ja_11_syntax.lesson_05_methods;

/**
 * Created by Aleksey on 27.02.2017.
 */
public class TestParamMethods {
    public static void main(String[] args) {

        int [] a = {1};
        changea0(a);
        System.out.println(a[0]);
    }

    private static void changea0(int [] input) {
        input[0] = 1000;
    }
}
