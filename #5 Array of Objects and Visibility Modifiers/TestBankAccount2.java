package DES103_LAB05_BankAccount;

public class TestBankAccount2 {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Paris Hilton", "127-983-3847", 1000000.00);
        System.out.println(acc.accountNumber);
    }
}
