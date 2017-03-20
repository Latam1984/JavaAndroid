package JA_11_OOP.lesson_13_interface_practice.les_13_interfaces_practic;

public class Account implements IAccount {
    private String name;
    private int money;

    public Account(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public String getName() {
        return name;
    }

    @Override
    public void withDraw(int amount) {
        money-=amount;
    }

    @Override
    public void deposit(int amount) {
        money+=amount;
    }
}
