package JA_11_OOP.Lesson_07.Date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Aleksey on 06.03.2017.
 */
public class TestDate {
    public static void main(String[] args) {
        Date date1 = new Date();
        Date date2 = new Date(System.currentTimeMillis());//1970.01.01 000000
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date1.getTime());
        System.out.println(date2.getTime());

        SimpleDateFormat sd = new SimpleDateFormat("yyyy:MM:dd");
        System.out.println(sd.format(date1));
        //System.out.println(new SimpleDateFormat("yyyy:MM:dd").format(date1));
      //  date2.setTime(13242);
        System.out.println(date2);
        if (date1.after(date1)){
            System.out.println("d1 > d2");
        }
        if (date1.before(date1)){
            System.out.println("d1 > d2");
        }
    }


}
