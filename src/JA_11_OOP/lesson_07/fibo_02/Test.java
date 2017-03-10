package JA_11_OOP.lesson_07.fibo_02;

/**
 * Created by Aleksey on 06.03.2017.
 */
public class Test {
    public static void main(String[] args) {
    Fibo fibo =new Fibo();
        for (int i = 0; i < 6; i++) {
            System.out.println(fibo.next() + " ");
        }
        fibo.reset();
        for (int i = 0; i < 12; i++) {
            System.out.println(fibo.next() + " ");
        }

    }
}
