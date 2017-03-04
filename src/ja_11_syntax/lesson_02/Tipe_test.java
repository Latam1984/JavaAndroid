package ja_11_syntax.lesson_02;

/**
 * Created by Aleksey on 22.02.2017.
 */
public class Tipe_test {
    public static void main(String[] args) {
        int a = 1111111111;
        long b = 11111111111L;
        char c = 'A';
        boolean b1 = true;
        short f = 500;

       // short g = f + 1; //error
        short g = (short) (f+1);

       // float h = 12345678910.0; //error
       float h1 = (float) 12345678910.0; //1
       float h2 =  12345678910.0F; //2

        //double d = 11111111111111;// error
        double d1 = 11111111111111.0;//1

    }
}
