class A  
{
	void lights()
	{
		System.out.println("Hellogen light ");
	}
}

class B extends A
{
	void lights()
	{
		System.out.println("LED LIGHTS");

	}
}
class method_overriding
{

	public static void main(String[] args) 
	{
		A a1 =  new A();
		a1.lights();


		B b1 = new B();
		b1.lights();


		A a2 =  b1;//method overriding  1st ways of upcasting //
		a2.lights();


		A a3 = new B();//methord overriding 2nd ways of ucasting
		a3.lights();

	}
}
