
import java.util.Scanner;
class scanners2 
{
	public static int sum(int a,int b)
	{
		int c = a+b;
		return c;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the number");
		int a = sc.nextInt();

		System.out.println("enter the number");
		int b = sc.nextInt();

		int add = sum(a,b);
		System.out.println("sum of two  number is :-"+add);

		
	}
}
