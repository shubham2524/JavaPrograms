import java.util.*;
class set_method 
{

	public static void main(String[] args) 
	{
		
	ArrayList a = new ArrayList();
	a.add(10);
	a.add(20);
	a.add(40);
	a.add(20);
	System.out.println(a.set(2,50));//here 40 replaced with 50
	System.out.println(a);
	}
}