//WAP to do operation of /,*,% by taking two numbers in console.

public class Operator{
	public static void main(String [] args){
	int x , y;
	x=Integer.parseInt(args[0]);
	y=Integer.parseInt(args[1]);
	
	int res=x/y;
	System.out.println("Divide is:"+res);

	int pro=x*y;
	System.out.println("Product is:"+pro);

	int modu=x%y;
	System.out.println("Modulus is:"+modu);
}
}
	
