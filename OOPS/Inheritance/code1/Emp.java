public class Emp
{
	private int eid;
	private String ename;
	private double basic;
	private static String org = "Google";

	public void setEmp(int eid , String ename , double basic)
	{
		this.eid = eid;
		this.ename = ename;
		this.basic = basic;
	}

	public void disp()
	{
	System.out.println(eid+" "+ename+" "+basic+" "+org);
	}
}