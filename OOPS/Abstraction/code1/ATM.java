abstract class ATM{

	double intRate;

	public ATM(double intRate){
	this.intRate = intRate;
	}
	//abstract method
	abstract void withdraw();
	
	//abstract method
	abstract void deposit();

	//concrete method
	void disp()
	{
	System.out.println("I'm ATM");
	}
}