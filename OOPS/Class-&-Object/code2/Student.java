//WAP which has "Student" as a class and print the student id , student name and //gpa within the same university using parameterized constructor.

class Student{
	private int sid;
	private String sname;
	private double gpa;
	private static String university = "Stanford";

	//default constructor
	public Student(){
	}

	//parameterized constructor
	public Student(int id , String name , double avg)
	{	
	 sid = id;
	 sname = name;
	 gpa = avg;
	}

	public void getStudent()
	{
	 System.out.println(sid+"  "+sname+"  "+gpa+"  "+university);
	}
}