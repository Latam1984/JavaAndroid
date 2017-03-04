package ja_11_syntax.lesson_02;

/**
 * Created by Aleksey on 23.02.2017.
 */
public class TestIncDec {
    public static void main(String[] args) {
        int a = 2;
        int b;
        //b = a++

        b = a;//
        a++;// b:2  a:3
     //--------------------------------

        a=2;
        //b=++a
        a++;
        b=a; //a:3  b=3

        //-----------------------------
        a=3;

        b = a++ + a++;
        System.out.println(a);//3+1+1=5
        System.out.println(b);//7


    }
}
