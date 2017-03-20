package JA_11_OOP.lesson_11.Les11.les_11_polymorph_hierarchy;

public abstract class Fish extends Animal {
    private boolean isFreshWaterLife;

    public Fish(String name, int maxAge, boolean isFreshWaterLife) {
        super(name, maxAge);
        this.isFreshWaterLife = isFreshWaterLife;
    }

    public abstract void swim();

    @Override
    public void sound() {
        System.out.println("bool-bool!....");
    }

    public boolean isFreshWaterLife() {
        return isFreshWaterLife;
    }
}
