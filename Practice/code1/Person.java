//1. Write a Java program to create a class called "Person" with a name and age attribute. Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age.

public class Person{
	String name;
	int age;
	
	public Person(String name , int age)
	{
		this.name = name;
		this.age = age;
	}	

	public void getPerson()
	{
		System.out.println(name+"  "+age);
	}

	public static void main(String[] args)
	{
		Person p1 = new Person("Kuheli",21);
		p1.getPerson();

		Person p2 = new Person("Koyel",15);
		p2.getPerson();
	}
}
