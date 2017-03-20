package JA_11_OOP.lesson_12_var_args;

/**
 * Created by Aleksey on 14.03.2017.
 */
public class TestRout {
    public static void main(String[] args) {
    Route route1 = new Route("Kiev", "Dnipro");
    Route route2 = new Route("Kiev", "Dnipro", "Odessa");
    Route route3 = new Route(new String[]{"Kiev"});

        System.out.println(route1);
        System.out.println(route2);
    }
}
