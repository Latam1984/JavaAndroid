package lesson16_arraylist;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Aleksey on 20.03.2017.
 */
public class SublistTest {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList(Arrays.asList("AB", "CD", "EF", "GH"));
        List<String> sublist = list.subList(1,3);
        list.set(1, "cd");
        System.out.println("sublist = " + sublist);

        list.subList(1,3).remove(0);
        System.out.println("List " + list);
    }
}
