package ja_11_syntax.lesson_06_method_practice;

/**
 * Created by Aleksey on 01.03.2017.
 */
public class TaskSumIf {

    public static void main(String[] args) {
        double [] arr ={-100, 200,300,-150};
        System.out.println(sumIf(arr, "<>-150"));

    }
    public static double sumIf(double[] a, String filter){
        //<0
        //<=100
        double thrash;
        String condition;
        double sum = 0;


        if (!Character.isDigit(filter.charAt(1)) && filter.charAt(1) != '-'){
            thrash = Double.parseDouble(filter.substring(2));
            condition = filter.substring(0,2);
        }else {
            thrash = Double.parseDouble(filter.substring(2));
            condition = filter.substring(0,1);
        }
     //   System.out.println(thrash + "/" + condition);
        for (int i = 0; i < a.length; i++) {
            if (condition.equals(">") && a[i]>thrash)
            if (condition.equals("<") && a[i]<thrash)
            if (condition.equals(">=") && a[i]>=thrash)
            if (condition.equals("<=") && a[i]<=thrash)
            if (condition.equals("<>") && a[i]!=thrash)
            if (condition.equals("=") && a[i]==thrash){
                sum+= a[i];
            }
        }
        return sum;
    }
}
