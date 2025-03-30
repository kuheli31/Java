public class A implements Printable{//extends Showable
	public void print(){
	System.out.println("Printing...");
	}

	public void show(){
	System.out.println("Showing...");
	}

	public static void main(String [] args)
	{
		Printable p = new A();
		p.print();
		p.show();
	}
}