package ja_11_syntax.lesson_04_arrays.tasks;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;

/**
 * Created by Aleksey on 27.02.2017.
 */
public class TaskSelectChars {
    public static void main(String[] args) {
        char [] chars = "aSDFG-hJkL!7QW!".toCharArray();
        System.out.println(Arrays.toString(chars));

        char [] letters = new char[chars.length];
        char [] digits = new char[chars.length];
        char [] others = new char[chars.length];

        int i1 = 0, i2 = 0, i3 = 0;

        for (int i = 0; i < chars.length; i++) {
           if (Character.isLetter(chars[i])){
               letters[i1++] = chars[i];
           } else
               if (Character.isDigit(chars[i])){
                   digits[i2++] = chars[i];}
            else {
                   others[i3++] = chars[i];
               }
        }
        letters = Arrays.copyOfRange(letters,0,i1);
        digits = Arrays.copyOfRange(digits,0,i2);
        others = Arrays.copyOfRange(others,0,i3);

        System.out.println(Arrays.toString(letters));
        System.out.println(Arrays.toString(digits));
        System.out.println(Arrays.toString(others));

    }
}
