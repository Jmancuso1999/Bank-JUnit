package bank;

public interface BankAccount {
    int getBalance();
    int getAvailBalance();
    boolean deposit(int amt);
    boolean withdraw(int amt);
}