import java.io.*;
//file writer
public class FWDemo
{
	public static void main(String[] args) throws IOException
	{	

		/* method 1:
		FileWriter fw = new FileWriter("first.txt" , true); // appending(means each time run , lines get added with old ones) - true

		BufferedWriter bw = new BufferedWriter(fw); */

		//method2 : anonymous object
		BufferedWriter bw = new BufferedWriter(new FileWriter("first.txt" , true));

		bw.write("Java is an OOP language");
		bw.write("Java is secure and robust");

		bw.close();
		System.out.println("File written successfull!!!");
	}
}