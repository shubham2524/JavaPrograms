class A 
{
	A()
	{//super ();
		System.out.println("constructor -1");
	}
}
class B extends A
{
	B()
	{//super();
		System.out.println("constructor - 2");
	}
}
class constructor_chaining 
{


	public static void main(String[] args) 
	{
		B obj =  new B();

	
	}
}
