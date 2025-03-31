public class Outer // default,public,final,abstract,strctfp
{

private int data=100;

	class Inner
	{
		void msg()
		{
			System.out.println("Data of Outer Class is = "+data);
		}
	}

	void disp(){
	System.out.println("I'm outer class method.");
	}

	public static void main(String [] args)
	{
		Outer out = new Outer();//outer object
		Outer.Inner in = out. new Inner();//inner object

		in.msg();

		out.disp();
	}
}