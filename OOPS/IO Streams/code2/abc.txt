import java.io.*;

//read and write in same file
public class RWDemo
{
	public static void main(String[] args) throws Exception
	{
		FileReader fr = new FileReader("RWDemo.java"); // to read same .java file

		FileWriter fw = new FileWriter("abc.txt");

		int x;

		while((x = fr.read()) != -1)
		{
			fw.write(x); // write(int)
			System.out.print((char)x); // int to char
		}

		System.out.println("\nFile read and successfully written to abc.txt file");
		
		fr.close();
		fw.close();
	
	}
}