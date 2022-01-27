class A
{
	A()
	{
	}
	A(int a)
	{
		System.out.println("A-constructor");
	}

	A(int a,int b)
	{
		System.out.println("B-constructor");
	}


}
class B extends A
{
	
	B(int a)
	{
		super(10,20);
		System.out.println("c-constructor");
	}
	B(int a,int b)
	{
		System.out.println("D-constructor");
	}

}

class supers
 {

 
	public static void main(String[] args) 
	{
		B b = new B(10);
	}
}
