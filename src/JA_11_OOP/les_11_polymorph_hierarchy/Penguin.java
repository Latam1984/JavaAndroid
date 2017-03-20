package JA_11_OOP.les_11_polymorph_hierarchy;

/**
 * Created by Aleksey on 13.03.2017.
 */
public class Penguin extends Bird implements Swim {

    private int minutesUnderWater;

    public Penguin(String name, int maxAge, int wingSize, int minutesUnderWater) {
        super(name, maxAge, wingSize);
        this.minutesUnderWater = minutesUnderWater;
    }

    @Override
    public void swim() {
        System.out.println("Penguin is swim.");
    }

    @Override
    public void sound() {
        System.out.println("quickkkk - qui");
    }

    @Override
    public void eat() {
        System.out.println("Penguins eat fish");
    }

    @Override
    public String toString() {
        return this.getName()+ " " + this.getMaxAge() + " " + "wSize="
                + getWingSize()+ "minutesUnderwater= " + minutesUnderWater;
    }

    @Override
    public void fly() {
        System.out.println("Penguin do not fly");
    }
}
