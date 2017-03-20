package JA_11_OOP.lesson_13_interface_practice.lesson_13_some_task;

import java.util.Arrays;

/**
 * Created by Aleksey on 17.03.2017.
 */
public class Lotto {
    int[] lotto = new int[36];

    public Lotto() {
        this.lotto = lotto;
        for (int i = 0; i < lotto.length; i++) {
                lotto[i] = (int) (1 + Math.random() * 10);
        }
    }

//    public int[] generation(int[] lotto) {
//        for (int i = 0; i < lotto.length; i++) {
//            lotto[i] = (int) (Math.random() * 100);
//        }
//        return lotto;
//    }

    public void next() {
        int number = 0;
        int[] someArray = new int[5];
        for (int i = 0; i < someArray.length; i++) {
            number = (int) (Math.random() * lotto.length);
            someArray[i++] = lotto[number];
        }
        System.out.println(Arrays.toString(someArray));
    }
}
