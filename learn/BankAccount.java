public class BankAccount
{
    String accountNumber;
    long balance;

    BankAccount(String accountNumber, long balance)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(long amount)
    {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(long amount)
    {
        if (amount <= balance)
        {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        }
        else
        {
            System.out.println("Insufficient balance");
        }
    }

    public static void main(String[] args)
    {
        BankAccount b1 = new BankAccount("ACC123", 1000);
        b1.deposit(200);
        b1.withdraw(100);
        System.out.println("Final Balance: " + b1.balance);
    }
}
