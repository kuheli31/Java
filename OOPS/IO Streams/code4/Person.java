import java.io.Serializable;

public class Person implements Serializable
{
	private String name;
	transient private int age;//0
	transient private long aadhar;// it cannot be serialized - OL

	public Person(String name , int age , long aadhar)
	{
		this.name = name;
		this.age = age;
		this.aadhar = aadhar;
	}

	@Override
	public String toString()
	{
		return "[Student:- Name:"+name+" Age:"+age+" Aadhar:"+aadhar+" ]";
	}
}