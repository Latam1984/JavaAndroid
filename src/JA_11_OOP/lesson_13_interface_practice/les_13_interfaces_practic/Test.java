package JA_11_OOP.lesson_13_interface_practice.les_13_interfaces_practic;

public class Test {
    public static void main(String[] args) {

        Bank bank = new Bank(3);
        bank.addAccount(new Account("A",2000));
        bank.addAccount(new Account("B",3000));
        bank.addAccount(new Account("C",4000));

        for (int i = 0; i < 3; i++) {
            System.out.println(bank.getBalance(i));
        }

        boolean b = bank.transferMoney(0,2,2000);
        System.out.println(b);
        for (int i = 0; i < 3; i++) {
            System.out.println(bank.getBalance(i));
        }
        System.out.println("richestId=" + bank.findRichestId());
    }
}
