class A 
{
	int a;
	public static void Add()
	{
		System.out.println("sum");
	}
}

class B extends A

{
	int j;
	int k;

	
}
class I2 extends B
{
	public static void main(String[] args) 
	{
		B b = new B();
		System.out.println(b.j);
		System.out.println(b.a);
		b.Add();

	}
}
