public class TechEmp extends Emp
{
	int bonus;
	public void setBonus(int bonus)
	{
	this.bonus = bonus;
	}

	public void getBonus()
	{
	System.out.println("Bonus:"+bonus);
	} 
	
	//re-defining -> overriding
	@Override
	public void calSalary()
	{
		int da = 42;
		int hra = 30;
		int ta = 8;
		double salary = bonus + basic + basic*(da + hra + ta)/100;//Updated Salary
		System.out.println("Total Salary:"+salary);
	}


	public static void main(String [] args)
	{
	TechEmp te = new TechEmp();
	te.setEmp(564,"Koyel",99000);
	te.setBonus(10000);
	te.disp();
	te.getBonus();
	te.calSalary();
	}
}