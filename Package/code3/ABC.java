package in.pune;

public class ABC{
	private int a;

	public ABC(int a){
	this.a = a;
	}

	public void getA(){
	System.out.println("Value of a from class ABC: "+a);
	}

	public static void main(String[] args)
	{
		ABC abc = new ABC(199);
		abc.getA();
	}
}

//compile
//javac ABC.java -> normal way
//javac -d . ABC.java ->packages

//Run
//java in.pune.ABC