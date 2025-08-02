//Write a Java program that reads a number in inches and converts it to meters.
//Note: One inch is 0.0254 meter.

import java.util. *;
public class unit
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter inches:");
		int inch = sc.nextInt();
		double ans = inch * 0.0254;
		System.out.println(inch+" inches to meters is = "+ans);
	}
}