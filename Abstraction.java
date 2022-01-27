abstract class  A
{
	void Add()
	{
		System.out.println("this is concrete method");
	}
	void Add1()
	{
		System.out.println("this is concrete2nd method");
	}
	abstract void Add2();//abstract method
}




class B extends A
{
	 void Add2()
	{
		System.out.println("this is abstract method");
	}
}



class Abstraction
{


	public static void main(String[] args) 
	{
		B b = new B ();
		b.Add();
		b.Add1();
		b.Add2();


		A a1 = b;//upcasting 
		a1.Add2();


		A a2 = new B();//upcasting 
		a2.Add2();


		/*we cannot create of abstarct class here but we can create the obj ref.
		A a =  new A();
		*/






		
	}
}
