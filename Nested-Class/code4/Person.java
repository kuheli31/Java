public interface Person{//Anonymous class
	
	void eat();

	void speak();

	public static void main(String[] args)
	{	
		Person p = new Person()
		{
			public void eat()
			{
			System.out.println("Eating Fruits");
			}
			
			public void speak()
			{
			System.out.println("Hindi");
			}
		};
		
		p.eat();
		p.speak();
	}

}