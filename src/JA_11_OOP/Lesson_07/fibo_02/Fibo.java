package JA_11_OOP.Lesson_07.fibo_02;

/**
 * Created by Aleksey on 06.03.2017.
 */
public class Fibo {
    private int a1;
    private int a2;


    public Fibo() {
        res();
    }

    public int next() {
        int a3 = a1 + a2;
        a1 = a2;
        a2 = a3;
        return a3;
    }

    public void reset() {
        res();
    }

    private void res() {
        a1 = 1;
        a2 = 0;
    }


}
