package JA_11_OOP.stringbuffer;

/**
 * Created by Aleksey on 09.03.2017.
 */
public class StringBuilderTest {

    public static void main(String[] args) {
        StringBuilderTest sb  = new StringBuilderTest();
        long start = System.currentTimeMillis();
        //    sb = new StringBuilderTest();
        for (int i = 0; i < 10000; i++) {
            //sb.append();
        }
        System.out.println(System.currentTimeMillis() - start);


    }
}
