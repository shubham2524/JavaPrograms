//wap to sum of all the elements given by users.
import java.util.Scanner;
class  array_scanner_add
{
	public static void main(String[] args) 
	{
		int sum = 0;
		Scanner s = new Scanner (System.in);

		
		System.out.println("enter the size");
		int size = s.nextInt();

		int [] a= new  int [size];

		System.out.println("enter the values");
		for (int i =0;i<a.length ;i++ )
		{
			a[i] =s.nextInt();
		}
		for (int i= 0;i<a.length ;i++ )
		{
			 sum = sum+ a[i];
			

		}
		System.out.println("sum of elements of array :-"+sum);
	}
}
