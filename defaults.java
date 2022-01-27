class A 
{
	void method()// by default it is default 
	{
		System.out.println("this is super class- default method");
	}
}
class B extends A
{
	 void method()// by default it is also  default....for over ridding it sholud me DEFAULT,PROTECTED,PUBLIC ONLY .
	{
		System.out.println("this is sub class-default method");
	}
}
class defaults
{

	public static void main(String[] args) 
	{
		A a1 = new B();
		a1.method();
		
	}
}
