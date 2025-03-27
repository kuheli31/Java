public class Emp
{
	private int eid;
	private String ename;
	protected double basic;
	private static String org = "Google";

	public Emp(int eid , String ename , double basic)
	{
		this.eid = eid;
		this.ename = ename;
		this.basic = basic;
	}
	
	public double getBasic()
	{
	return basic;
	}
	public void disp()
	{
	System.out.println(eid+" "+ename+" "+basic+" "+org);
	}

	public void calSalary()
	{
		int da = 42;
		int hra = 30;
		int ta = 8;
		double salary = basic + basic*(da + hra + ta)/100;
		System.out.println("Total Salary:"+salary);
	}
}