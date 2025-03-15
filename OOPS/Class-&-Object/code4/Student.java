class Student{
	private int sid;
	private String sname;
	private double gpa;
	private static String university;
	private String city;

	//static block
	static{
	university = "IEM";
	}

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

	//static method
	public static void change()
	{
	 university = "IIT Bombay";
	}

	public void getStudent()
	{
	 System.out.println(sid+"  "+sname+"  "+gpa+"  "+city+"  "+university);
	}
}