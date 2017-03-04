package ja_11_syntax.lesson_02;

/**
 * Created by Aleksey on 23.02.2017.
 */
public class TestString {
    public static void main(String[] args) {
        //строки не изменяемы в Java. записывает другую чтроку по новому адресу
        String s = "Java";// [j, a, v, a] //@1234
        s = " "; // [' '] //@2345

        System.out.println("java".substring(1, 2));
        String s1 = "super"; // "super"
        String s2 = "sonic"; //"sonic"
        String s3 = s1 + s2; // "supersonic"
        String s4 = s1.substring(1, 3); // up
        int x = s2.length(); // 5
        String s5 = s1.toUpperCase(); //"SUPPER"
        char c = s1.charAt(0);// "c"
        int pos = s1.indexOf("s");
        String s6 = s3.replace("sonic", "power");
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
    }
}
