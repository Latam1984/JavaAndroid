package JA_11_OOP.lesson_07.Date.Task1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Aleksey on 06.03.2017.
 */
public class Person  {
    private String name;
    private Date birthDate;
    private static SimpleDateFormat dFormat;

    static {dFormat = new SimpleDateFormat("dd.MM.yyyy");}

    public Person(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public Person(String name, String strDate) throws ParseException {
        this.name = name;
        this.birthDate = dFormat.parse(strDate);
    }

    public String getName() {
        return this.name;
    }

    public Date getBirthDate() {
        return new Date(birthDate.getTime());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthDate=" + dFormat.format(birthDate) +
                '}';
    }
}
