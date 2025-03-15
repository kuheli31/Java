class Student{
	private int sid;
	private String sname;
	private double gpa;
	private static String university = "Stanford";
	private String city;

	//default constructor
	public Student(){
	}

	//parameterized constructor
	public Student(int sid , String sname , double gpa)
	{	
	 this.sid = sid;
	 this.sname = sname;
	 this.gpa = gpa;
	}

	public Student(int sid , String sname , double gpa , String city)
	{
	 this(sid , sname , gpa);
	 this.city = city;
	}	

	public void getStudent()
	{
	 System.out.println(sid+"  "+sname+"  "+gpa+"  "+city+"  "+university);
	}
}