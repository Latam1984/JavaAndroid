package JA_11_OOP.lesson_12_var_args;

import java.util.Arrays;

/**
 * Created by Aleksey on 14.03.2017.
 */
public class Route {

    String[] cities;

    public Route() {
        System.out.println("Default");
    }

    public Route(String c1, String c2, String... cities) {
        this.cities = new String[cities.length + 2];
        this.cities[0] = c1;
        this.cities[1] = c2;
        for (int i = 0; i < cities.length; i++) {
            this.cities[i+2] = cities[i];
        }
    }

    public Route(String[] cities) {
        this.cities = new String[cities.length];
        for (int i = 0; i < cities.length; i++) {
            this.cities[i] = cities[i];
        }
    }

    @Override
    public String toString() {
        return "Route{" +
                "cities=" + Arrays.toString(cities) +
                '}';
    }
}
