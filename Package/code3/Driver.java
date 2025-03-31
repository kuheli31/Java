package in;//import custom packages , you should be in a package
import in.pune.*;//implicit import
import in.hyd.XYZ;//explicit import

public class Driver{
	public static void main(String[] args)
	{
	ABC abc = new ABC(199);
	abc.getA();

	XYZ xyz = new XYZ(139);
	xyz.getX();
	}
}