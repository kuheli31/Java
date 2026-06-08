import java.io.*;
//file writer
public class FWDemo
{
	public static void main(String[] args) throws IOException
	{
		//File f = new  File("first.txt"); //method 1: created - if exists - replaced
		//FileWriter fw = new FileWriter(f); //method 1: to write on that file first.txt

		FileWriter fw = new FileWriter("first.txt"); //method 2: to write on that file first.txt


		//FileWriter fw = new FileWriter("first.txt" , true); // appending(means each time run , lines get added with old ones) - true

		fw.write("Java is an OOP language");
		fw.write("Java is secure and robust");

		fw.close();
		System.out.println("File written successfull!!!");
	}
}