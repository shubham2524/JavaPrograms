//in multi-level inheritence ,child class is parent of another class.
class A
{
	int i;
	public void Add()
	{
		System.out.println("parent class");
	}
}
class B extends A
{
	int j;
	public void Add1()
	{
		System.out.println("child -class");
	}
}


class C extends B
{
	int k;
	public void Add2()
	{
		System.out.println("sub-child -class");
	}
}

class multi_level 
{
	public static void main(String[] args) 
	{

		C c =  new C();
		c.Add();
		c.Add1();
		c.Add2();
		System.out.println(c.i);
		System.out.println(c.j);
		System.out.println(c.k);
		System.out.println("Hello World!");


		B b = new B();
		b.Add();
		b.Add1();
		//b.Add2();
		System.out.println(b.i);
		System.out.println(c.j);
		//System.out.println(c.k);



		A a = new A();
		a.Add();
		//a.Add1();
		//a.Add2();
		System.out.println(a.i);
		//System.out.println(a.j);
		//System.out.println(a.k);

		
	
	
	
	
	
	
	}






}
