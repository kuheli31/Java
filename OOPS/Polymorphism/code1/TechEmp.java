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
	Emp e1 = new TechEmp(564,"Koyel",99000,10000);//upcasting
	e1.disp();//overriden method + upcasting => Runtime Polymorphism(RTP)
	e1.calSalary();//overriden method + upcasting => Runtime Polymorphism(RTP)
	System.out.println("Not Upcasting:");
	Emp e = new Emp(103,"Kuheli",100000);//Not Upcasting
	e.disp();//static binding parent's
	e.calSalary();//static binding parent's
	System.out.println("Not Upcasting:");
	TechEmp te = new TechEmp(1234,"Durjoy",1000,500);//Not Upcasting
	te.disp();//static polymorphism
	te.calSalary();//static polymorphism
	System.out.println("e is a parent reference to child object te.");
	e=te;//upcasting
	e.disp();//RTP -child's
	e.calSalary();//RTP -child's
	}
}