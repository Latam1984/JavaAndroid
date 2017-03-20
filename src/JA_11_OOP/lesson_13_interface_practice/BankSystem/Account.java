package JA_11_OOP.lesson_13_interface_practice.BankSystem;

/**
 * Created by Aleksey on 14.03.2017.
 */
public class Account implements IAccount {
    private String name;
    private int money;


    public Account(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }

    @Override
    public void withdraw(int amount) {
        setMoney(money - amount);
    }

    @Override
    public void deposit(int amount) {
        setMoney(money - amount);
    }
}
