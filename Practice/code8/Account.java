import java.util.ArrayList;

// Account class to maintain individual account details
class Account {
    private long accountId;
    private String accountName;
    private double balance;
    
    // Constructor
    public Account(long id, String name, double balance) {
        this.accountId = id;
        this.accountName = name;
        this.balance = balance;
    }
    
    // Getters
    public long getAccountId() {
        return accountId;
    }
    
    public String getAccountName() {
        return accountName;
    }
    
    public double getBalance() {
        return balance;
    }
    
    // Deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }
    
    // Withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds!");
        }
    }
    
    // Display account info
    public void displayAccount() {
        System.out.println("Account ID: " + accountId + ", Name: " + accountName + ", Balance: $" + balance);
    }
}