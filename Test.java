class Animal 
{
	
}
class Fish extends Animal
{
	String colour ;
	public void type ()
	{
		System.out.println("aquatic animals ");
	}
	
}
class Test 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.m1();




		B b1 = new B();
		b1.m1();




		A a2 = new B();//upcasting 
		a2.name = whale;
		a2.colour = blue ;
		a2.m1();
		System.out.println(a2.name);
		System.out.println(a2.colour);



		

	}
}
