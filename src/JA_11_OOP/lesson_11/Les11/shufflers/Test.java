package JA_11_OOP.lesson_11.Les11.shufflers;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        int [] a = {1,2,3,4,5,6,7};
        ArrayShuffler.shuffle(a);

        System.out.println(Arrays.toString(a));
    }
}
