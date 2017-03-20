package JA_11_OOP.lesson_13_interface_practice.BankSystem;

import JA_11_OOP.lesson_13_interface_practice.BankSystem.Account;
import JA_11_OOP.lesson_13_interface_practice.BankSystem.Transaction;

/**
 * Created by Aleksey on 14.03.2017.
 */
public class Bank implements Comparable {
    private Account[] accounts = new Account[10];
    private int index = -1;

    public void addAccount(Account a) {
        index++;
        accounts[index] = a;
        accounts[++index] = a;
    }

    public boolean transferMoney(int idFrom, int idTo, int amount) {
        return Transaction.transfer(accounts[idFrom], accounts[idTo], amount);
    }

    public int getBalance(int id) {
        int sum = accounts[id].getMoney();
        return sum;
    }

    public int findReachestId() {
        int id = 0;
        int maxAmount = accounts[0].getMoney();
        for (int i = 1; i < index; i++) {
            if (accounts[i].getMoney() > maxAmount) {
                maxAmount = accounts[i].getMoney();
                id = i;
            }
        }
        return id;
    }


    public int findRichestId() {
        compareTo(accounts);
        return 0;
    }

    @Override
    public int compareTo(Object o) {
        int sum = 0;

        return 0;
    }
}
