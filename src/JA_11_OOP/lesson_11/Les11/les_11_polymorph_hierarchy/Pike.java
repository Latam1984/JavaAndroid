package JA_11_OOP.lesson_11.Les11.les_11_polymorph_hierarchy;

public class Pike extends Fish {
    boolean isMagic;

    public Pike(String name, int maxAge, boolean isFreshWaterLife, boolean isMagic) {
        super(name, maxAge, isFreshWaterLife);
        this.isMagic = isMagic;
    }

    @Override
    public void swim() {
        System.out.println("pike swimming...");
    }

    @Override
    public void eat() {
        System.out.println("pike eating something...");
    }

    @Override
    public String toString() {
        return null;
    }
}
