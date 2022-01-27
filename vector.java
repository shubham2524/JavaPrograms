import java.util.*;
class vector 
{
	public static void main(String[] args) 
	{
		Vector v = new Vector();
		v.add(10);
		v.add(54);
		v.add ("hello");
		System.out.println(v);
		v.removeElement("hello");
		System.out.println(v);
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		v.removeElement (new Integer(54));
		System.out.println(v);


		
	}
}
