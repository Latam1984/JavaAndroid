package JA_11_OOP.lesson_11.Les11.les_11_polymorph_hierarchy;

public abstract class Bird extends Animal {
    private int wingSize;

    public Bird(String name, int maxAge, int wingSize) {
        super(name, maxAge);
        this.wingSize = wingSize;
    }
    public abstract void fly();

    public int getWingSize() {
        return wingSize;
    }
}
