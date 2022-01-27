class call_static_method 
{
	public static void main(String[] args) 
	{
		called1();//directly
		call_static_method.called1();//by class name 
		sample.called2();//by class name
	}
	public static void called1()
	{
		System.out.println("this is called methord1");
	}
}
class sample
{
	public static void called2()
	{
		System.out.println("this is called method 2");
	}
}
