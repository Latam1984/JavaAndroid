package ja_11_syntax.lesson1;

/**
 * Created by Aleksey on 22.02.2017.
 */
public class Hello {
    public static void main(String[] args) {
        String s, s1, s2;   // объявление
        s = "Hello";        //инициализация
        s1 = " world!";
        System.out.println("Hello, Java!");
        System.out.println(s + s1);

        int a = 10;
        int b = 20;
        System.out.println(a+b);
        System.out.println(s+a); //a приводится в стринг
        System.out.println(s+a+b); // a -> String
        System.out.println(s+(a+b));// a->String



    }
}
