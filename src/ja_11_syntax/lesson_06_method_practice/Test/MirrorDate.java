package ja_11_syntax.lesson_06_method_practice.Test;

/**
 * Created by Aleksey on 01.03.2017.
 */
public class MirrorDate {
    public static void main(String[] args) {
        //вернуть строку 2012.12.12
        String s = "12.12.2012";
        String strNew = yearFirstDate(s);
        System.out.println(strNew);

    }
//реализация через substring
    private static String yearFirstDate1(String s) {
        String year = "";
        String month = "";
        String day = "";

        for (int i = 0; i < s.length(); i++) {
            year = s.substring(6);
            month = s.substring(2, 4);
            day = s.substring(1);

        }

        //System.out.println(year+month+day);


        return null;
    }
//реілизация через вхождение точки
    public static String yearFirstDate (String s){
        int i1 = s.indexOf(".");
        System.out.println(i1);
        int i2 = s.lastIndexOf(".");
        System.out.println(i2);
        return s.substring(i2+1) + "." + s.substring(i1+1,i2) + "." + s.substring(0, i1);


    }

    public static String yearFirstDate2(String s){
        String [] parts = s.split("\\."); //["12","12","2012"]
        return parts[2] +"."+parts[1]+"." + parts[0];
    }
}
