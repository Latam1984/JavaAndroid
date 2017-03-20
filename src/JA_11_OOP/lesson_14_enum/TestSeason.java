package JA_11_OOP.lesson_14_enum;

import java.util.Arrays;

/**
 * Created by Aleksey on 16.03.2017.
 */
public class TestSeason {
    public static void main(String[] args) {
        Season s1 = Season.WINTER;
        Season s2 = Season.SPRING;

        System.out.println(s1 + " " + s2);

        //enum - String
        String winter = Season.WINTER.toString();
        //String to enum
        Season summer = Season.valueOf("SUMMER");

        Season[] seasons = Season.values();
        System.out.println(Arrays.toString(seasons));


        //index - enum
        System.out.println(Season.values()[3]);//autumn

        //enum - index
        System.out.println(Season.AUTUMN.ordinal());//3

    }

    static Season nextSeason(Season s) {

        return Season.values()[(s.ordinal() + 1) % (Season.values().length)]; // 4-> 4%4=0


    }
}
