package JA_11_OOP.lesson_10_polymorphizm_casting;

/**
 * Created by Aleksey on 09.03.2017.
 */
public class Worker {
    private String name;
    private int salary;

    public Worker(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
