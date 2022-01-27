import java.util.Scanner;
class array_scanner 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);

		System.out.println("enter the size");
		 int size =  s.nextInt();

		 int [] a =new int [size];
		 System.out.println("enter the value");
		 for (int i = 0;i<a.length ;i++ )
		 {
			 a[i] = s.nextInt();

		 }
		 System.out.println("the elements are");
		 for (int i = 0;i<=a.length-1 ;i++ )
		 {
			 System.out.println(a[i]);
		 }
		 
	}
}
