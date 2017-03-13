package JA_11_OOP.les_11_polymorph_hierarchy;

public class Duck extends Bird{
    private boolean isDomestic;

    public Duck(String name, int maxAge, int wingSize, boolean isDomestic) {
        super(name, maxAge, wingSize);
        this.isDomestic = isDomestic;
    }

    @Override
    public void fly() {
        System.out.println("duck flying...");
    }

    @Override
    public void sound() {
        System.out.println("krrryyaaaa!");
    }

    @Override
    public void eat() {
        System.out.println("duck eating...");
    }

    @Override
    public String toString() {
        return null;
    }
}
