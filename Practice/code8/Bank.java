//7. Write a Java program to create a class called "Bank" with a collection of accounts and methods to add and remove accounts, and to deposit and withdraw money. Also define a class called "Account" to maintain account details of a particular customer.

import java.util.ArrayList;
// Bank class to manage collection of accounts
public class Bank {
    private ArrayList<Account> accounts;
    
    // Constructor
    public Bank() {
        accounts = new ArrayList<>();
    }
    
    // Add account
    public void addAccount(long id, String name, double balance) {
        Account newAccount = new Account(id, name, balance);
        accounts.add(newAccount);
        System.out.println("Account added successfully!");
    }
    
    // Remove account by ID
    public void removeAccount(long id) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccountId() == id) {
                accounts.remove(i);
                System.out.println("Account " + id + " removed successfully!");
                return;
            }
        }
        System.out.println("Account " + id + " not found!");
    }
    
    // Find account by ID
    public Account findAccount(long id) {
        for (Account account : accounts) {
            if (account.getAccountId() == id) {
                return account;
            }
        }
        return null;
    }
    
    // Deposit money to specific account
    public void deposit(long id, double amount) {
        Account account = findAccount(id);
        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Account " + id + " not found!");
        }
    }
    
    // Withdraw money from specific account
    public void withdraw(long id, double amount) {
        Account account = findAccount(id);
        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("Account " + id + " not found!");
        }
    }
    
    // Display all accounts
    public void displayAllAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts in the bank.");
        } else {
            System.out.println("All Accounts:");
            for (Account account : accounts) {
                account.displayAccount();
            }
        }
    }
    
    // Main method to test the system
    public static void main(String[] args) {
        Bank bank = new Bank();
        
        // Add accounts
        bank.addAccount(1001, "Alice", 5000.0);
        bank.addAccount(1002, "Bob", 3000.0);
        bank.addAccount(1003, "Charlie", 7000.0);
        
        // Display all accounts
        bank.displayAllAccounts();
        
        System.out.println("\n--- Banking Operations ---");
        
        // Deposit money
        bank.deposit(1001, 1500.0);
        
        // Withdraw money
        bank.withdraw(1002, 500.0);
        
        // Try invalid operations
        bank.withdraw(1003, 10000.0); // Insufficient funds
        bank.deposit(1004, 100.0);    // Account not found
        
        // Remove an account
        bank.removeAccount(1002);
        
        // Display all accounts after operations
        System.out.println("\nFinal Account Status:");
        bank.displayAllAccounts();
    }
}