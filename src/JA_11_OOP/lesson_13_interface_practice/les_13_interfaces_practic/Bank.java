package JA_11_OOP.lesson_13_interface_practice.les_13_interfaces_practic;

public class Bank {
     private Account [] accounts;
     private int currIndex;

    public Bank(int n) {
        this.accounts = new Account[n];
        this.currIndex = -1;
    }

    public void addAccount(Account a){
        accounts[++currIndex] = a;
    }
    boolean transferMoney(int idFrom, int idTo, int amount){
        return Transaction.transfer(accounts[idFrom],accounts[idTo],amount);
    }
    public int getBalance(int id){
        return accounts[id].getMoney();
    }
    public int findRichestId(){
        if (currIndex<0) return -1;
        int id = 0;
        int maxAmount = accounts[0].getMoney();
        for (int i = 1; i <= currIndex; i++) {
            if(accounts[i].getMoney()>maxAmount){
                maxAmount = accounts[i].getMoney();
                id = i;
            }
        }
        return id;
    }
}
