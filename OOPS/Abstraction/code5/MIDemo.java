//Multiple Inheritance
interface Printable{
	void print();
}

interface Showable{
	void show();
}

public class MIDemo implements Printable,Showable{
	public void print(){
	System.out.println("Its Printing...");
	}

	public void show(){
	System.out.println("Its Showing...");
	}

	public static void main(String[] args)
	{
	MIDemo m = new MIDemo();
	m.print();
	m.show();
	}
}

