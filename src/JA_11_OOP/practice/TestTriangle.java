package JA_11_OOP.practice;

/**
 * Created by Aleksey on 03.03.2017.
 */
public class TestTriangle {
    public static void main(String[] args) {
    Triangle triangle1 = new Triangle(5,1,1);
    Triangle triangle2 = new Triangle(3,4,5);


        System.out.println(triangle1.toString());
        System.out.println(triangle2.toString());

        System.out.println("Площадь = " + triangle2.getArea());
        System.out.println("Перемитр = " + triangle2.getPer() );


    }

    static int compare (Triangle t1, Triangle t2){
        //return Double.compare(t1.getArea(), t2.getArea());
       double d = t1.getArea() - t2.getPer();
        if(d>0)return 1;
        if(d == 1) return 0;
        return -1;
    }
}
