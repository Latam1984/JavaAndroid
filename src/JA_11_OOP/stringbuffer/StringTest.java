package JA_11_OOP.stringbuffer;

/**
 * Created by Aleksey on 09.03.2017.
 */
public class StringTest {
    public static void main(String[] args) {
        String s = "";

        long start = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            s = s + "java";
        }
        System.out.println(System.currentTimeMillis() - start);
        //====================================================
        for (int i = 0; i < 20000; i++) {
            s = s + "java";
        }
        System.out.println(System.currentTimeMillis() - start);

        //=====================================================
        for (int i = 0; i < 30000; i++) {
            s = s + "java";
        }
        System.out.println(System.currentTimeMillis() - start);

    }
}
