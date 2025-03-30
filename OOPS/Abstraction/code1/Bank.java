public class Bank extends ATM{
	int cashBack;//child specific - intRate from parent's

	public Bank(double intRate , int cashBack)
	{
	super(intRate);
	this.cashBack = cashBack;
	}

	void withdraw(){
	System.out.println("Withdraw success!");
	System.out.println("Congrats! you got cashback of Rs."+cashBack);
	}

	void deposit(){
	System.out.println("Deposit success!");
	System.out.println("Congrats! you got interest @"+intRate);
	}

	@Override
	void disp()
	{
	super.disp();
	System.out.println("I'm Bank.");
	}

	void fun()
	{
	System.out.println("I'm child specific class");
	}

	public static void main(String [] args)
	{
		ATM a1 = new Bank(8.5,30);//upcasting
		a1.withdraw();
		a1.deposit();
		a1.disp();

		Bank b1 = new Bank(8.5,30);
		b1.fun();
	}
}