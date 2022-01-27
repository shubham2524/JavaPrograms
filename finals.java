class finals  
{
	final int a =10;
	final void method1()
	{
		System.out.println("this is final methd");
	}
	public static void main(String[] args) 
	{

		finals fn = new finals();
		//fn.a = 10; we can not change the final variable and method here 
		System.out.println(fn.a);
		fn.method1();
	}
}
