package JA_11_OOP.lesson_11.Les11.les_11_polymorph_hierarchy;

public class Shark extends Fish {
    private int teethCount;

    public Shark(String name, int maxAge, boolean isFreshWaterLife, int teethCount) {
        super(name, maxAge, isFreshWaterLife);
        this.teethCount = teethCount;
    }

    @Override
    public void swim() {
        System.out.println("...shark is swimming...");
    }

    @Override
    public void eat() {
        System.out.println("...shark eats other fauna...");
    }

    @Override
    public String toString() {
        return this.getName() + ", " + this.getMaxAge() + ", isFrW="+
                this.isFreshWaterLife()+", teethCount="+this.teethCount;
    }
}
