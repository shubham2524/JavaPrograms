import java.util.*;
class  links_list
{
	public static void main(String[] args) 
	{
		LinkedList l = new LinkedList();
		l.add(10);
		l.add("hello");
		l.add(25.5);
		System.out.println(l);
		l.addFirst("first");
		System.out.println(l);
		l.addLast("last");
		System.out.println(l);
		l.removeFirst();
		System.out.println(l);
		l.removeLast();
		System.out.println(l);
		

		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		//convert link list into arrya list

		ArrayList a = new ArrayList(l);
		


	}
}
