import java.io.*;
public class SerializeTest{
	public static void main(String[] args) throws Exception
	{
		Person p1 = new Person("Ram" , 21 , 123456);
		System.out.println(p1);//p1.toString()

		//Serialization
		FileOutputStream fos = new FileOutputStream("person.info");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(p1);

		//De-Serialization
		FileInputStream fis = new FileInputStream("person.info");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Person p2 = (Person) ois.readObject(); // returns java.lang.Object

		//print object
		System.out.println(p2);
	}
}