public class Cat extends Animal{
	@Override
	public void makeSound()
	{
	System.out.println("Cat Meows.");
	}

	public static void main(String [] args)
	{
	Cat ob = new Cat();
	ob.makeSound();
	}

}