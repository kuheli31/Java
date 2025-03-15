//WAP to read many numbers from keyboard and find the sum of all the numbers.
public class Sum{
	public static void main(String[] args)
	{
	int sum=0;
	for(int i=0 ; i<args.length ; i++)
	{
	sum += Integer.parseInt(args[i]);
	}
	System.out.println("Sum is: " +sum);
	}
}