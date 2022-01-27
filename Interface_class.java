interface A
{
	void sum ();
	void sub();

} 
abstract class B implements A
{
	static void m1()
	{
		System.out.println("this is static method ");
	}

}
class C implements A
{
	public void  sum ()
	{
		System.out.println("this is abstract method");
	}

	public void  sub ()
	{
		System.out.println("this is 2-abstract method");
	}
}
class Interface_class
{


	public static void main(String[] args) 
	{
		C c1 = new C ();
		c1.sum();
		c1.sub();

		System.out.println("=======================");
	}
}
