public class ITCDemo{
	public static void main(String[] args)
	{
		Customer c1 = new Customer(25000);
		
		//anonymous inner classes and thread objects
		new Thread(){
			public void run()			
			{ 
				c1.withdraw(30000); 
			}
		}.start();

		new Thread(){
			public void run(){ c1.deposit(25000); }
		}.start();

	}
}

/*
OUTPUT:

D:\Coding\Desktop\Java\OOPS\Multithreading\code7>java ITCDemo
going to withdraw:
Less balance: waiting for deposit
going to deposit:
Deposit completed!!
balance: 50000.0
Withdraw completed!!
balance: 20000.0

*/