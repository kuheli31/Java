//WAP to add numbers using methods without returning using variable arguments.

public class Add3{
	//method definition
	static void add(int... x){
	int sum=0;
	for(int i=0 ; i<x.length ; i++)
	{
		sum = sum + x[i];
	}
	System.out.println("Sum is ="+sum);
	}

	public static void main(String[] args){
	add(10,20);
	add(20,30,20);	
	add(50,70,20,20);
	add(1,2,3,4,5,6,7,8,9,10);
	}
}