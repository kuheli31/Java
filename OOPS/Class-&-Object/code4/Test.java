public class Test{
	public static void main(String[] args){

	Student s1 = new Student(123, "Kuheli" , 8.5);//parameterized constructor
	s1.getStudent();

	Student.change();//calling static method
	Student s2 = new Student(101, "Koyel" , 9.0 , "Kolkata");
	s2.getStudent();

	Student s3 = new Student(108, "Durjoy" , 8.0 , "Kolkata");
	s3.getStudent();
}
}