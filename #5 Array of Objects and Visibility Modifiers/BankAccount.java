package DES103_LAB05_BankAccount;

public class BankAccount {
    private String ownerName;
    String accountNumber;
    private double balance;
    public static int numAccount = 0;
    public BankAccount(String ownerName, String accountNumber, double balance) {
        this.ownerName = ownerName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        numAccount++;
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit $" + amount);
    }
    protected void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdraw $" + amount);
        } else {
            System.out.println("Not enough balance!");
        }
    }
    void printInfo(){
        System.out.println(ownerName + "\t" + accountNumber + "\t" + balance);
    }
    public double getBalance() {
        return balance;
    }
}
