import java.util.*;
class Linked_hash_set 
{
	public static void main(String[] args) 
	{
		LinkedHashSet l = new LinkedHashSet ();
		l.add(10);
		l.add(20);
		l.add("hello");

		System.out.println(l.size());
		System.out.println(l);

		for(Object i:l)
		{
			System.out.println(i);
		}

	
	}
}
