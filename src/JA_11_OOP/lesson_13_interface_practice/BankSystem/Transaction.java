package JA_11_OOP.lesson_13_interface_practice.BankSystem;

/**
 * Created by Aleksey on 14.03.2017.
 */
public class Transaction {
    static boolean transfer(Account from, Account to, int amount) {
        if (from.getMoney() < amount) {
            from.withdraw(amount);
            to.deposit(amount);
            return true;
        }
        return false;
    }
}
