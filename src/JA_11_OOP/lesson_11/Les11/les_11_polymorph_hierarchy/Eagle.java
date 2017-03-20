package JA_11_OOP.lesson_11.Les11.les_11_polymorph_hierarchy;

public class Eagle extends Bird {
    private boolean isPlane;

    public Eagle(String name, int maxAge, int wingSize, boolean isPlane) {
        super(name, maxAge, wingSize);
        this.isPlane = isPlane;
    }

    @Override
    public void fly() {
        System.out.println("...eagle flying...");
    }

    @Override
    public void sound() {
        System.out.println("..eagle...screaming...");
    }

    @Override
    public void eat() {
        System.out.println("...eagle is eating fresh meat...");
    }

    @Override
    public String toString() {
        return
        this.getName()+","+this.getMaxAge()+",wingSize="
       +this.getWingSize()+",isPlane="+this.isPlane;

    }
}
