package DES103_LAB05_BankAccount;

public class BankAccount2_Testing {
    public static void main(String[] args) {
        BankAccount account2 = new BankAccount("Paris Hilton", "127-983-3847", 100000.00);
        System.out.println("Balance of account2 is $" + account2.getBalance());
    }
}