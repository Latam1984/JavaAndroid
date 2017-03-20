package JA_11_OOP.lesson_13_interface_practice.les_13_interfaces_practic;

public class Transaction {

    static boolean transfer(Account from, Account to, int amount){
        if (from.getMoney()<amount) return false;
        from.withDraw(amount);
        to.deposit(amount);
        return true;
    }
}
