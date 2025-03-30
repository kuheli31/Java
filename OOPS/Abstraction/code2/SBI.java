public class SBI implements RBI{

	public void withdraw()
	{
	System.out.println("Withdraw success!");
	}

	public void deposit()
	{
	System.out.println("Congrats! you got interest @"+intRate);
	}

	public void transfer()
	{
	System.out.println("Transfer success!");
	}

	public void disp()
	{
	System.out.println("I'm SBI");
	}

	public static void main(String [] args)
	{
		RBI r1 = new SBI();
		r1.withdraw();
		r1.deposit();
		r1.transfer();

		SBI s1 = new SBI();
		s1.disp();
		
	}

}