//2. Write a Java program to create a class called "Dog" with a name and breed attribute. Create two instances of the "Dog" class, set their attributes using the constructor and modify the attributes using the setter methods and print the updated values.

public class Dog
{
	String name , breed;

	public Dog(String name , String breed)
	{
	this.name=name;
	this.breed=breed;
	}

	public void setName(String name)
	{
	this.name=name;
	}

	public String getName()
	{
	return name;
	}
	
	public void setBreed(String breed)
	{
	this.breed=breed;
	}

	public String getBreed()
	{
	return breed;
	}

	public static void main(String [] args)
	{
	Dog d1 = new Dog("Durjoy","Monkey");
	System.out.println("Dog is " +d1.getName()+ " and Breed is "+d1.getBreed());
	System.out.println("After Updating:");
	
	d1.setName("Koyel");
	d1.setBreed("Human");
	System.out.println("Dog is " +d1.getName()+ " and Breed is "+d1.getBreed());
	}
}