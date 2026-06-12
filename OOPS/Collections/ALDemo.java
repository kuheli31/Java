import java.util.*;

public class ALDemo{

	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add("Java");
		al.add(10);//duplicate
		al.add(true);
		al.add(3.14);
		al.add('X');

		List<Integer> al2 = new ArrayList<>();//generics
		al2.add(100);
		al2.add(12);
		al2.add(15);

		System.out.println(al2);
		Collections.sort(al2);
		System.out.println("After Sorting!");
		System.out.println(al2);
		al.addAll(al2);

		System.out.println(al);
		System.out.println("Size: "+al.size());

		al.remove(4); //10
		al.remove(8);
		System.out.println(al);

		for(Object obj:al)
		{
			
		}
		
		//universal cursor
		Iterator<Integer> itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

		Iterator itr = al.iterator();//alternate of Object

		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}
}