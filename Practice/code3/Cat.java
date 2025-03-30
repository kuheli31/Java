public class Cat extends Animal{
	@Override
	public void makeSound()
	{
	System.out.println("Cat Meows.");
	}

	public static void main(String [] args)
	{
	Animal a1 = new Animal();
	a1.makeSound();

	Cat c1 = new Cat();
	c1.makeSound();
	}

}