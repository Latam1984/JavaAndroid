package JA_11_OOP.lesson_10_polymorphizm_casting;

/**
 * Created by Aleksey on 09.03.2017.
 */
public class Manager extends Worker {
    private int bonus;


//    public Manager(String name, int salary) {
//        super(name, salary);
//    }

    public Manager(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    @Override
    public int getSalary() {
        return super.getSalary() + this.bonus;
    }

    @Override
    public String toString() {
        return "Manager {" + "salary" + this.getSalary() + " (" + super.getSalary() + "+" + bonus;
    }
}
