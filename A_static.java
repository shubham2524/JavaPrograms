class A_sataic 
{
	public static void main(String[] args) 
	{
		B_static.staticmethod();
		System.out.println(B_static.a);
	}
}
class B_static 
{
	static int a = 10;
	public static void staticmethod() 
	{

		
		
		
			System.out.println("this is static method");
		
		
	}
}
