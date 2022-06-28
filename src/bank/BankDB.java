package bank;

public interface BankDB {
    public int [] getData(int actNum);
    public void putData(int actNum, int [] data);
}
