package ja_11_syntax.lesson_02;

/**
 * Created by Aleksey on 23.02.2017.
 */
public class TestScope {
    public static void main(String[] args) {
        double x;
        String s = null;
        {
           // double x;//уже объявлен в области видимости
            double y;
            //z=8;//error  Еще не объявлен
            int k;
        }
        double y;
        double z;
       // k = 0;//Error не видит ее т.к. находится в другом блоке
        System.out.println(s);//
    }
}
