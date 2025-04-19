import java.util.Scanner;
public class ExceptionDemo1
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();

		int sum = a+b;
		System.out.println("Sum is: "+sum);

		//enforcing - exception handling
		try{
		int res = a/b;//throw new java.lang.ArithmeticException()
		System.out.println("Divide is: "+res);
		}
		catch(ArithmeticException e)
		{
		e.printStackTrace();
		}

		int prod = a*b;
		System.out.println("Product is: "+prod);

		System.out.println("Rest of the code...");
	}
}