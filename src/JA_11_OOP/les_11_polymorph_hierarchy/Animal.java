package JA_11_OOP.les_11_polymorph_hierarchy;

public abstract class Animal {
    private String name;
    private int maxAge;

    public abstract void sound();
    public abstract void eat();

    public Animal(String name, int maxAge) {
        this.name = name;
        this.maxAge = maxAge;
    }

    public String getName() {
        return name;
    }

    public int getMaxAge() {
        return maxAge;
    }

    @Override
    public abstract String toString(); // =)
}
