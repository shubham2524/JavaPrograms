class A 
{
	static int a = 10;
	int b = 20;
}
class B extends A
{
	static int a = 30;
	int b = 40;
}

	class variable_shadowing
	{
	
	public static void main(String[] args) 
	{
		A obj = new B ();//upcasting 
		System.out.println(obj.a);//we cannot ovveride here in variable shadowing 
		System.out.println(obj.b);
	}
}
