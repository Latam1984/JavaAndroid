package ja_11_syntax.lesson_04_arrays;

/**
 * Created by Aleksey on 27.02.2017.
 */
public class TestIrregularArray {
    public static void main(String[] args) {
        int [][]b = new int[8][];
        for (int i = 0; i < b.length; i++) {
            b[i] = new int[i + 1];
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = i+j;
                System.out.println(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
