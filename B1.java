class A
{
	static int  a;
	public static void work()
	{
		System.out.println("employee works");
	}
}
class B1 extends A
{
	public static void main(String[] args) 
	{
		System.out.println(a);
		work();
	}


	
	
}
