package JA_11_OOP.StaticNonStatic;

/**
 * Created by Aleksey on 03.03.2017.
 */
public class A {
    int v;
    static int statV;

    public static void main(String[] args) {
        A.statV = 10;
        System.out.println(A.statV);

//        A a = new A();
//        a.v = 5;
//        System.out.println("a.v = " + a.v);
//    }
        Person p1 = new Person("John", 1);
        System.out.println(Person.getCount());
        System.out.println(p1.getCount());

    }

    static void changeV() {
        A.statV++;
    }
}