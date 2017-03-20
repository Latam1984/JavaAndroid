package JA_11_OOP.practice;

/**
 * Created by Aleksey on 03.03.2017.
 */
public class Triangle {
    private double a, b, c;
    private boolean exists;

    public Triangle(double a, double b, double c) {
        exists = a + b > c && a + c > b && b + c > a;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getArea () {
        return Math.sqrt((a+b+c)*(-a+b+c)*(a-b+c)*(a+b-c))/4; //формула герона - поиск площади
    }

    public double getPer (){
        return a+b+c;
    }

    public  int compareTo(Triangle other){
        int dif = Double.compare(this.getArea(), other.getArea());
        return dif;
    }

    public String toString() {
        return "Return triangle:\n" +
                "a = " + a + "\n" +
                "b = " + b + "\n" +
                "c = " + c + "\n"
                + "Exists = " + exists;
    }


}
