package JA_11_OOP.Lesson_07.my_variant_fibo;

/**
 * Created by Aleksey on 06.03.2017.
 */
public class Fibo {

    public int [] fiboNumbers (){
        int[]arr = new int [8];
        int startNumber = 1;
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            arr [0] = startNumber;
            startNumber = (arr [i]-1) +(arr [i] -2);

        }
        return arr;
    }
}
