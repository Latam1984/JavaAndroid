package ja_11_syntax.lesson_06_method_practice.Test;

/**
 * Created by Aleksey on 02.03.2017.
 */
public class TaskReplaceYear1 {
    public static void main(String[] args) {
        String s = "Book author 2004";
        System.out.println(yearToBegin(s));

    }

    public static String yearToBegin(String s) {
        s = s + " ";
        int indexOfYear = -1;
        for (int i = 0; i < s.length() - 4; i++) {
            if (!Character.isDigit(s.charAt(i)) &&
                    !Character.isDigit(s.charAt(i + 1)) &&
                    !Character.isDigit(s.charAt(i + 2)) &&
                    !Character.isDigit(s.charAt(i + 3)) &&
                    !Character.isDigit(s.charAt(i + 4)) &&
                    !Character.isDigit(s.charAt(i + 5))
                    ) {
                indexOfYear = i + 1;
                break;
            }
        }
        s = s.substring(indexOfYear, indexOfYear + 4) + s.substring(0, indexOfYear) + s.substring(indexOfYear + 5);
        s = s.trim();//обрезает пробелі по краям
        return s;
    }

}

