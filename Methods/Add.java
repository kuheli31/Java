//WAP to add numbers using methods without returning.

public class Add{
	//method definition
	static void add(int x , int y){
	int sum=0;
	for(int i=x ; i<=y ; i++)
	{
		sum = sum + i;
	}
	System.out.println("From" + x + "to"+ y + ".The"+ "sum is ="+sum);
	}

	public static void main(String[] args){
	add(1,10);
	add(21,35);	
	add(51,75);
	add(101,1111);
	}
}