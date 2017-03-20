package JA_11_OOP.lesson_13_interface_practice.BankSystem;

import JA_11_OOP.lesson_13_interface_practice.BankSystem.Account;
import JA_11_OOP.lesson_13_interface_practice.BankSystem.Bank;

/**
 * Created by Aleksey on 14.03.2017.
 */
public class TestBankAccount {
    public static void main(String[] args) {
    Bank bank = new Bank();
    bank.addAccount(new Account("a", 2000));
    bank.addAccount(new Account("b", 1000));
    bank.addAccount(new Account("c", 1500));



    }
}
