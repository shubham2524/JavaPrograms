class stack_unwinding  
{
	static void a()
	{
		int  k= 6/0;
		System.out.println(k);
	}
	static void b()
	{
		a();
	}
	static void c()
	{
		b();
	}
	public static void main(String[] args) 
	{
		c();
		
	}
}
