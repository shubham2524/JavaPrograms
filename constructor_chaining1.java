class A 
{
	A()
	{//super ();
		System.out.println("constructor -1");
	}

	A(int a)
	{
		System.out.println("constructor -2");
	}
}
class B extends A
{
	B()
	{//super();
		System.out.println("constructor - 3");
	}

	B(int a )
	{
		super (10);
		System.out.println("constructor -4");
	}
}
class constructor_chaining1 
{


	public static void main(String[] args) 
	{
		B obj =  new B();
		B obj1 =  new B(10);

	
	}
}
