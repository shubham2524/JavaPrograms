class A
{
	A(int a )
	{
		this();
		System.out.println("Hello");
	}
	A()
	{
		System.out.println("HII");
	}
}

class B extends A
{
	B (String s)
		{
		this (10.2);
		System.out.println(s);
	    }

		B (double d)
	{
			super (10);
			System.out.println("10.2");
	}
}

class this_super_mix
{

	public static void main(String[] args) 
	{
		B b = new B("bye");
		
	}
}
