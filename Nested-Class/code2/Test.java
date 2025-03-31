public class Test{//main class
	public static void main(String[] args)
	{	
		Person p = new Person()//process instantiation + class definition
		{
			void eat()
			{
			System.out.println("Eating Fruits");
			}
		};
		
		p.eat();
	}
}