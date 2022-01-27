import java.util.Scanner;
class array_scanner_method_add 
{
	public static int sum(int a[])
	{
		int sum = 0;
		for (int i =0;i<a.length ;i++ )
		{
			sum = sum + a[i];

		}
		return sum;
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int [] a = new int [5];
		System.out.println("enter the elements values");
	
		for (int i = 0;i<a.length ;i++)
		{
			a[i] = s.nextInt();

		}
		int add= sum (a);
		System.out.println(add);

		
	}
}
