package ja_11_syntax.lesson_05_methods;

/**
 * Created by Aleksey on 27.02.2017.
 */
public class TestParamMethodsString {
    public static void main(String[] args) {
        String s = "java";
        change(s);
        System.out.println(s);
    }

    private static void change(String str) {
        str = "sqrt"; // no influence
        System.out.println(str);
    }
}
