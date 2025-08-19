package AccountTest;

public class AccountTest {
 //property Data Bank
    public static void main(String[] args) {
        SavingsAccount account1 = new SavingsAccount();
        account1.nama = "Wildan";
        account1.saldo = 2000.0;
        account1.bunga = 0.02;
        account1.cetak();

        SavingsAccount account2 = new SavingsAccount();
        account2.nama = "Aladin";
        account2.saldo = 10000.0;
        account2.cetak();
    }   
}
