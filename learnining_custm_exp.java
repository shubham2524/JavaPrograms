import java.util.Scanner;
class AA1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("please enter your age ");
		int age = sc.nextInt ();
		try
		{
			if (age<21)
			{
				throw new underageException("underage");
			}
			else 
			{
				System.out.println("show profiles");
			}
			
		}
		catch (underageException u)
		{
			System.out.println("exception occured but it is handled");

		}
		


	}
}
class underageException extends Exception
{
	String message;
	underageException(String message)
	{
		this.message =message;
	}

}
