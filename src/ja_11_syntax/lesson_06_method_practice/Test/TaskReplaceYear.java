package ja_11_syntax.lesson_06_method_practice.Test;

/**
 * Created by Aleksey on 02.03.2017.
 */
public class TaskReplaceYear {
    public static void main(String[] args) {
        String someString = "Java8 Book 2004 Vasya12 Pupkin201111";
        System.out.println("Строка до изменений: " + someString);
        System.out.println("Cтрока после изменений: " + replaceYear(someString));
    }
//не работает при вхождении 6ти чисел/проблема в if - искать не число
    private static String replaceYear(String someString) {
        int count = 0;
        int year = 0;
        for (int i = 0; i < someString.length(); i++) {
            if (Character.isDigit(someString.charAt(i))){
                count++;
            }else {
                count = 0;
            }

            if(count == 4 && count<5 && !Character.isDigit(i+4)){
                year = i - 4;

            }
        }
            String years = someString.substring(year+1, year+5);
            String firstString = someString.substring(0, year);
            String secondString = someString.substring(year+5, someString.length());
            //System.out.println(years);

        return new String(years+ " " + firstString + secondString);
    }
}
