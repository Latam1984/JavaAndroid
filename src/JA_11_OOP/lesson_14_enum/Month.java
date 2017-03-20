package JA_11_OOP.lesson_14_enum;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Aleksey on 16.03.2017.
 */
public enum Month {
    JAN(31), FEB(28), MAR(31), APR(30), MAY(31), JUN(30), JUL(31), AUG(31), SEP(30), OCT(31), NOV(30), DEC(31);
    private int daysCount;

    Month(int daysCount) {
        this.daysCount = daysCount;
    }

    public int getDaysCount() {
        return daysCount;
    }

    public void setDaysCount(int daysCount) {
        if (!(daysCount == 28 || daysCount == 29))
            if (this == FEB)
                this.daysCount = daysCount;
    }


    @Override
    public String toString() {
        return this.name() + "(" + daysCount + "(";
    }

    public static void main(String[] args) {
        Month[] month = Month.values();
        Month.FEB.setDaysCount(29);
        System.out.println(Arrays.toString(month));
        Arrays.sort(month, new Comparator<Month>() {
            @Override
            public int compare(Month m1, Month m2) {
                return m1.daysCount - m2.daysCount;
            }
        });
    }
}
