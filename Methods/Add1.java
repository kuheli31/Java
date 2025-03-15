//WAP to add numbers using methods with returning.

public class Add1{
	//method definition
	static int add(int x , int y){
	int sum=0;
	for(int i=x ; i<=y ; i++)
	{
		sum = sum + i;
	}
	return sum;
	}

	public static void main(String[] args){
	System.out.println("From 1 to 10.The sum is ="+add(1,10));
	System.out.println("From 21 to 35.The sum is ="+add(21,35));
	System.out.println("From 51 to 75.The sum is ="+add(51,75));	
	System.out.println("From 101 to 1111.The sum is ="+add(101,1111));
	}
}