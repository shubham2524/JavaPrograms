import java.util.*;
class short_list 
{
	public static void main(String[] args) 
	{
		
		ArrayList <Integer> a3 = new ArrayList<>();
		a3.add(32);
		a3.add(34);
		a3.add(53);
		Collections.sort(a3);//ascending ordder
		System.out.println(a3);


		Collections.reverse(a3);//decending order
		System.out.println(a3);

	}
}