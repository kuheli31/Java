// Write a Java program to create a class called "Dog" with a name and breed attribute. Create two instances of the "Dog" class, set their attributes using the constructor and modify the attributes using the setter methods and print the updated values.

public class Dog
{
	String dname , dbreed;

	public Dog(String name , String breed)
	{
		dname = name;
		dbreed = breed;
	}

	public void setDog(String dname , String dbreed)
	{
		this.dname = dname;
		this.dbreed = dbreed;
	}

	public void getDog()
	{
		System.out.println("Name: "+dname+" Breed: "+dbreed);
	}

	public static void main(String[] args) {
        Dog p1 = new Dog("Kuheli", "Skin");
	p1.setDog("Durjoy" , "Cow");
	p1.getDog();
        
        Dog p2 = new Dog("Koyel", "Foil");
        p2.getDog();
    }

}