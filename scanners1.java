import java.util.Scanner;
class scanners1 
{
	public static void main(String[] args) 
	{
		Scanner sc =  new Scanner (System.in);
		
		
		System.out.println("enter first number");
		int a = sc.nextInt();

		System.out.println("enter second number");
		int b = sc.nextInt();



		int multiply = a*b;
		System.out.println("multiply of two number is :-"+multiply );




	}
}