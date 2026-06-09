public class Customer{
	double balance;
	public Customer(double balance){
		this.balance = balance;
	}

	public void getBalance(){
		System.out.println("balance: "+balance);
	}

	public synchronized void withdraw(double amount){
		System.out.println("going to withdraw:");

		if(amount>balance)
		{
			System.out.println("Less balance: waiting for deposit");
			try{
				wait();//ITC(Inter Thread Communication)
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}

		balance = balance - amount;
		System.out.println("Withdraw completed!!");
		getBalance();
	}

	public synchronized void deposit(double amount){
		System.out.println("going to deposit:");

		balance = balance + amount;
		System.out.println("Deposit completed!!");
		getBalance();
		notify(); //ITC(Inter Thread Communication)
	}
}