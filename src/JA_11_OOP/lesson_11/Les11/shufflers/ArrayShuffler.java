package JA_11_OOP.lesson_11.Les11.shufflers;

import java.util.Random;

public class ArrayShuffler {
    static void shuffle(int [] arr){
        //Random r = new Random();
        //r.nextInt(arr.length);
        for (int i = 0; i < arr.length; i++) {
            int ind = (int)(Math.random()*arr.length);
            int tmp;
            tmp = arr[i];
            arr[i] = arr[ind];
            arr[ind] = tmp;
        }
    }
}
