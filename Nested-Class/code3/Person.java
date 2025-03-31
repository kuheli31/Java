public abstract class Person{
	
	abstract void eat();

	public void speak(){
		System.out.println("English");
	}

	public static void main(String[] args)
	{	
		Person p = new Person()
		{
			void eat()
			{
			System.out.println("Eating Fruits");
			}
			
			@Override
			public void speak()
			{
			System.out.println("Hindi");
			}
		};
		
		p.eat();
		p.speak();
	}

}