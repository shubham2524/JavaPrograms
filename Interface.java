interface A
{

	void A();//compiler will  automatically add abstract before class and method  
	public static void  m1 ()
	{
		System.out.println("ist methood");
	}

	final static int a =10;


}




abstract class B implements A
{
	void m2 ()
	{
	System.out.println("this is sub class method");
	}

}





class C implements A
	{
		public void A()
		{
			System.out.println("this is abstract method");
		}
	}


	class Interface 
	{
		public static void main(String [] args)
		{
			
		C c1 = new C();
		A a2 = c1;
		a2.A();


		A a3 = new C();// we can not create the object of interface and abstarct class 
		a3.A();
		}

	}





