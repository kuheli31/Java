public class VotingApp{
	static void validate(int age) throws InvalidAgeException
	{
		if(age<18)
		      throw new InvalidAgeException("under age");
		else
		      System.out.println("Welcome to vote");
	}

	public static void main(String[] args)
	{
	  try{
	  validate(23);//age>18
	  validate(16);//age<18->exception must be thrown
	  }
	  catch(Exception e)
	  {
	  System.out.println(e);
	  }
	  finally{
	  System.out.println("Finally always get executed.");
	  }
	}
}