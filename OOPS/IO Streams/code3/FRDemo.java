import java.io.*;
//file reader
public class FRDemo{
	public static void main(String[] args) throws Exception
	{
		//FileReader fr = new FileReader("first.txt");
	//read() - reads a char and returns int
	//EOF - -1

	// wrapping anonymous object
	BufferedReader br = new BufferedReader(new FileReader("first.txt"));
	int x , count=0;

	while((x = br.read()) != -1)
	{
		System.out.print((char)x);// int to char explicitly typecasted
	count++;
	}
	System.out.println();
	System.out.println("No. of chars in the file="+count);


	br.close();
	}
}