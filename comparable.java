import java.util.*;
public class comparable implements Comparable
{
	String name;
	int eid;
	double salary;
comparable(String name,int eid ,double salary)
	{
	this.name = name;
	this.eid = eid;
	this.salary =salary;
	}

	public int compareTo(Object o)
	{
		if (this.eid==((comparable)o).eid)
		{
			return 0;

		}
		else if (this.eid==((comparable)o).eid)
		{
			return 1;

		}
		else 
		{
			return -1;
		}
	}





	public static void main(String[] args) 
	{
		ArrayList a1 = new ArrayList ();
		a1.add(new comparable("shubham",2,59586));
		a1.add(new comparable("saurabh",2,5562));
		a1.add(new comparable("singh",2,5000));

		System.out.println(a1);
		Collections.sort(a1);
		System.out.println(a1);

	}
}







