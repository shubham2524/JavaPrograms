import java.util.Scanner;
class A12
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("please enter your age ");
		int a = sc.nextInt ();
		if (a<=20)
		{
			System.out.println("you are underage");
		}
		else
		{
			System.out.println("eligible");
		}


	}
}
