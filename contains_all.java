import java.util.*;
class contains_all 
{

	public static void main(String[] args) 
	{
		
	ArrayList a = new ArrayList();
	a.add(10);
	a.add(20);

	
	ArrayList a1 = new ArrayList();
	a1.add(10);
	a1.add(20);
	System.out.println(a.containsAll(a1));//checking all elements of [] a is present inside [] a1
	}
}
