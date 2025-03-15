//WAP to print the Addition of two arguments.
public class Add{
	public static void main(String[] param)
	{
	int num1=Integer.parseInt(param[0]);//"123"--> 123
	int num2=Integer.parseInt(param[1]);//"321"--> 321
	
	int c=num1 + num2;//444

	System.out.println("Addition of two arguments is: " + c);
	}
}
//Input: java Add 123 321
//Output: Addition of two arguments is: 444