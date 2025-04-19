//Write a Java program to create a class called "Bank" with a collection of accounts and methods to add and remove accounts, and to deposit and withdraw money. Also define a class called "Account" to maintain account details of a particular customer.

public class Account{
	private String name;
	private String accountNumber;
	private double balance;

	public Account(String name,String accountNumber,double balance)
	{
	this.name=name;
	this.accountNumber=accountNumber;
	this.balance=balance;
	}

	public String getName()
	{
	return name;
	}

	public void setName(String name)
	{
	this.name=name;
	}

	public void setAccountNumber(String accountNumber)
	{
	this.accountNumber=accountNumber;
	}

	public String getAccountNumber()
	{
	return accountNumber;
	}

	public double getBalance()
	{
	return balance;
	}

	public void setBalance(double balance)
	{
	this.balance=balance;
	}

	public void withdraw(double amount)
	{
	balance = amount - balance;
	}

	public void deposit(double amount)
	{
	balance = amount + balance;
	}

	public String getAccountInfo()
	{
	return "Name: " + name + ", Account Number: " + accountNumber + ", Balance: " + balance;
	}
	
	public static void main(String[] args)
	{
	Account a1 = new Account("Kuheli Bera","12345",20);
	System.out.println(a1.getAccountInfo());
	a1.setBalance()=a1.deposit(100);
	System.out.println(a1.getAccountInfo());
	a1.setBalance(a1.withdraw(10));
	System.out.println(a1.getAccountInfo());
	}
}

