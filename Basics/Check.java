//WAP to find whether a given number is divisible by 3 and 7.

public class Check{
	public static void main(String [] args){
	
	int x=Integer.parseInt(args[0]);
	if(x%3==0 && x%7==0)
	{
	System.out.println("Number is divisible by 3 and 7.");
	}
	else
	{
	System.out.println("Number is not divisible by 3 and 7.");
	}
}
}