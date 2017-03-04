package ja_11_syntax.lesson_04_arrays;

/**
 * Created by Aleksey on 27.02.2017.
 */
public class TestArray2D_1 {
    public static void main(String[] args) {
        //Пример объявления, заполнения и вывода на экран двумерного массива
        int [] [] b = new int[4][5];
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = i+j;
                System.out.println(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
