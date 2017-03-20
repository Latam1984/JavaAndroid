package my_tasks.anagram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Aleksey on 15.03.2017.
 */

/*
anagram - find unique anagram and sorted them (alphabet)
 */
public class Anagram {
    public static void main(String[] args) {
        sentenceIn();
    }

    /*
    sentenceIn() method use scanner for ridding input string
     */
    public static void sentenceIn() {
        Scanner sc = new Scanner(System.in);
        String someString = sc.nextLine();
        String[] wordArray = someString.split(" ");
        analizeAnagrsm(wordArray);
    }

    /*
    analizeAnagram() method get input string array and convert strings in to char array,
    than sorted array and input in to hash map.
     */
    public static void analizeAnagrsm(String[] wordArray) {
        Map<String, String> map = new HashMap<String, String>();

        for (int i = 0; i <= wordArray.length - 1; i++) {
            String temp = wordArray[i];
            char[] tmp = temp.toCharArray();
            Arrays.sort(tmp);
            String wordKey = new String(tmp);

            String value = map.get(wordKey);

            if (value == null) {
                map.put(wordKey, temp);
            } else {
                map.put(wordKey, value + " " + temp);
            }
        }
        for (String s : map.keySet()) {
            System.out.println(s);
        }
    }
}

