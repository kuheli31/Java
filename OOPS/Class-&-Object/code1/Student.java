//WAP which has "Student" as a class and print the student id , student name and //gpa within the same university using get and set methods.

class Student{
	int sid;
	String sname;
	double gpa;
	static String university = "Stanford";

	public void setStudent(int id , String name , double avg)
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