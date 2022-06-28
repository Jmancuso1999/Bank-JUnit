package bank;

/* 
This is a mock DB to implment Bank data for 2 userss
*/

public class MockDB implements BankDB {
    
    @Override
    public int [] getData(int actNum) {
        int [] data = null;

        // data[0] = account status, data[1] = balance, data[2] = available balance, 
        // data[3] = transaction_limit, data[4] = session_limit

        if(actNum == 5555) {
            data = new int[5];
            data[0] = 0;
            data[1] = 0;
            data[2] = 0;
            data[3] = 100;
            data[4] = 500;
        }
        else if(actNum == 2222) {
            data = new int[5];
            data[0] = 1;
            data[1] = 587;
            data[2] = 346;
            data[3] = 100;
            data[4] = 800;
        }
        else if(actNum == 3333) {
            data = new int[5];
            data[0] = 0;
            data[1] = 897;
            data[2] = 239;
            data[3] = 1000;
            data[4] = 10000;
        }
        else if(actNum == 1111) {
            data = new int[5];
            data[0] = 0;
            data[1] = 1000;
            data[2] = 1000;
            data[3] = 100;
            data[4] = 500;
        }

        return data;
    }

    @Override
    public void putData(int actNum, int[] data) {
        return;        
    }
}
