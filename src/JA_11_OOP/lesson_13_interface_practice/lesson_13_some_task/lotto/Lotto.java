package JA_11_OOP.lesson_13_interface_practice.lesson_13_some_task.lotto;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Aleksey on 17.03.2017.
 */
public class Lotto {
    private Integer[] items;
    private int index;

    public Lotto(int n) {
        items = new Integer[n];
        index = -1;
        for (int i = 0; i < n; i++) {
            items[i] = i + 1;
        }
        shuffle();
    }

    private void shuffle() {
//        Comparator<Integer> c = new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return (int) (Math.random() * 3) - 1;
//            }
//        };
        //  Arrays.sort(items,c);
        Collections.shuffle(Arrays.asList(items));
    }

    public Integer next() {
        if (index > items.length - 1) return null;
        return items[++index];
    }

    public boolean hasNext() {
        return index < items.length - 1;
    }

    public void reset() {
        index = -1;
        shuffle();
    }
}
