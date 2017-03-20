package JA_11_OOP.lesson_13_interface_practice.lesson_13_some_task.lotto;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Aleksey on 17.03.2017.
 */
public class LotoTest {
    public static void main(String[] args) {
        Lotto lotto = new Lotto(36);
//        while (lotto.hasNext()){
//            System.out.println(lotto.next());
//        }
        System.out.println("=============================================");
        for (int i = 0; i < 5; i++) {
            System.out.println(lotto.next() + " ");

        }
    }
}
