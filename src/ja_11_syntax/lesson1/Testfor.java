package ja_11_syntax.lesson1;

/**
 * Created by Aleksey on 22.02.2017.
 */
public class Testfor {
    public static void main(String[] args) {
//        char c = 'a';
//        char h = (char) 97;
//        System.out.println(h);
//        System.out.println((int)c);
//
//        for (int i = 0; i<10; i++){
//            System.out.println(i);
//

//
//        char a = 'a';
//        System.out.println((int) a);
//        String s = "";
//
//        for (int i = 65; i < 91 ; i++) {
//           // System.out.print((char)i);
//            s = s + (char)i;
//        }
//
        String s = "";
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.println(s+=c);
        }

    }
}

