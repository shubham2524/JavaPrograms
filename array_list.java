import java.util.*;
class  array_list
{
	public static void main(String[] args) 
	{
		ArrayList  a = new ArrayList ();
		a.add(10);
		a.add("true");
		a.add("rohit");
		a.add(10);

		System.out.println(a);
		System.out.println(a.size());


		ArrayList  a1 = new ArrayList ();
		a1.add(10);
		a1.add(20);
		a1.add("hello");
		a1.add(40);
		System.out.println(a1);
		a1.add(1,50);//adding 50 in first index 
		System.out.println(a1);
		System.out.println(a1.isEmpty());
		//a1.addAll(a);//adding  array [] a  in [] a1 .
		//System.out.println(a1);

		/*for (int i = 0;i<a1.size() ;i++ )
		{
			System.out.println(a1.get(i));
		}*/
		a1.remove(0);
		System.out.println(a1);
		a1.remove("hello");
		System.out.println(a1);
		a1.remove(new Integer (10));//remove 10 values not the index values UNBOXING 
		a1.removeAll(a1);
		System.out.println(a1);
		a1.clear();
		System.out.println(a1);



		ArrayList <Integer> a3 = new ArrayList<>();
		a3.add(32);
		a3.add(34);
		a3.add(53);
		// for each loop
		/*for(Object i :a3)
		{
			System.out.println(i);
		}*/


		Iterator i  = a3.iterator();
		while (i.hasNext())
		{
			System.out.println(i.next());
		}



	}
}
