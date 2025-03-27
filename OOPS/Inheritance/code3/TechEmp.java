public class TechEmp extends Emp //must have a constructor if parent has a constructor
{
	//child specific members
	int bonus;
	public TechEmp(int eid , String ename , double basic , int bonus)
	{
	super(eid,ename,basic);//invokes parent's constructor-Emp
	this.bonus = bonus;
	}

	//re-defining disp
	@Override
	public void disp()
	{
	super.disp();//parent's class
	System.out.println("Bonus:"+bonus);
	} 
	
	//re-defining -> overriding
	@Override
	public void calSalary()//method signature must be same
	{
		int da = 42;
		int hra = 30;
		int ta = 8;
		double salary = bonus + getBasic() + getBasic()*(da + hra + ta)/100;//Updated Salary
		System.out.println("Total Salary:"+salary);
	}


	public static void main(String [] args)
	{
	TechEmp te = new TechEmp(564,"Koyel",99000,10000);
	te.disp();
	te.calSalary();
	}
}