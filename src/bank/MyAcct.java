package bank;

public class MyAcct implements BankAccount {
    
    // Values say not used - quick fix: create getters and setters for each
    private boolean status;
    private int balance;
    private int available_balance;
    private int transaction_limit;
    private int session_limit;
    private int total_this_session;

    public MyAcct(BankDB b, int actNum) {
        BankDB myBank = b; // Calls the interface method (BankDB) to get the implmented class (MockDB) information
        int [] data = null;
        data = myBank.getData(actNum);
        status = (data[0] == 0);
        balance = data[1];
        available_balance = data[2];
        transaction_limit = data[3];
        session_limit = data[4];
        total_this_session = 0;

    }

    @Override
    public int getBalance() {
        
        return balance;
    }

    @Override
    public int getAvailBalance() {

        return available_balance;
    }

    @Override
    public boolean deposit(int amt) {
        if(!status) return false;
        if(amt < 0) return false;
        balance += amt;
        return true;
    }

    @Override
    public boolean withdraw(int amt) {
        balance -= amt;
        return true;
    }

}
