import java.util.*;
class hash_set 
{
	public static void main(String[] args) 
	{
		HashSet h = new HashSet();
		h.add(10);
		h.add(20);
		h.add(30);
		h.add(10);



		System.out.println(h.size());

		//converting set into array list 
		ArrayList a = new ArrayList(h);
		Collections.sort(a);
		System.out.println(a);
	}
}
