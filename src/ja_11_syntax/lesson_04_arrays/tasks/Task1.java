package ja_11_syntax.lesson_04_arrays.tasks;





import java.util.Arrays;

/**
 * Created by Aleksey on 27.02.2017.
 */
public class Task1 {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5};
        int temp;
        for (int i = 0; i < a.length/2; i++) {
            temp = a[i];//1
            a[i] = a[a.length-i-1];//
            a[a.length-i-1] = temp;
        }
        System.out.println(Arrays.toString(a));
    }
}
