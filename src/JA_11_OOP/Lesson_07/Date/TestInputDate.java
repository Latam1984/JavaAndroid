package JA_11_OOP.Lesson_07.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by Aleksey on 06.03.2017.
 */
public class TestInputDate {
    public static void main(String[] args) throws ParseException {
        Date date;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your date (dd.MM.yyyy): ");
        String input = scanner.next();
        SimpleDateFormat sd = new SimpleDateFormat("dd.MM.yyyy");

        date = sd.parse(input);
        System.out.println(sd.format(date));

    }
}
