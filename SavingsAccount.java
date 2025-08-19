package AccountTest;

public class SavingsAccount {
    double saldo;
    double bunga = 0.02;
    String nama;
    public void cetak(){
        System.out.println("Customer Name" + nama);
        System.out.println("Balance"  + saldo);
        System.out.println("Interest Rate" + bunga);
        System.out.println("Interest Earned" + (saldo + bunga));
        System.out.println();
    }
}
