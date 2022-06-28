package bank.Test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import bank.BankAccount;
import bank.BankDB;
import bank.MockDB;
import bank.MyAcct;

public class MyAcctTest {

    private static BankDB myBank; //Interface object 

    @BeforeClass //Initializes object before creating this class
    public static void setUpBeforeClass() throws Exception {
        MyAcctTest.myBank = new MockDB(); 
        // MockDB is the class that implemented the BankDB interface.
    }

    @Test
    public void getBAL001() {
        //load account 5555
        BankAccount b = new MyAcct(MyAcctTest.myBank, 5555); // Gets all the data regarding account # 5555
        assertEquals("BAL001 failed", 0, b.getBalance());
    }

    @Test
    public void getBAL002() {
        //load account 5555
        BankAccount b = new MyAcct(MyAcctTest.myBank, 2222); // Gets all the data regarding account # 2222
        assertEquals("BAL001 failed", 587, b.getBalance());
    }

    @Test
    public void depositDEP001() {
        BankAccount b = new MyAcct(MyAcctTest.myBank, 3333); // Gets all the data regarding account # 2222
        assertTrue("DEP001 failed", b.deposit(1));
        assertEquals("DEP001 wrong balance", 898, b.getBalance());
        assertEquals("DEP001 wrong avail balance", 239, b.getAvailBalance());
    }

    @Test
    public void depositDEP002() {
        BankAccount b = new MyAcct(MyAcctTest.myBank, 2222); // Gets all the data regarding account # 2222
        assertTrue("DEP001 failed", b.deposit(1));
        assertEquals("DEP001 wrong balance", 588, b.getBalance());
        assertEquals("DEP001 wrong avail balance", 346, b.getAvailBalance());
    }

    @Test
    public void depositDEP003() {
        BankAccount b = new MyAcct(MyAcctTest.myBank, 1111); // Gets all the data regarding account # 2222
        assertTrue("DEP001 failed", b.withdraw(1));
        assertEquals("DEP001 wrong balance", 999, b.getBalance());
        assertEquals("DEP001 wrong avail balance", 999, b.getAvailBalance());
    }

    @Ignore
    @Test
    public void testGetAvailBalance() {
        fail("Not implmented yet");
    }
}
