class A 
{
	public static void m1()
	{
		System.out.println("super -class - method");
	}
}
class B extends A
{
	public static void m1()
	{
		System.out.println("sub-class -method");
	}

}
class method_shadowing
{

	public static void main(String[] args) 
	{

		B b1 = new B();
		b1.m1();

		//here both the method are static so it will call only super class method.
		//because static method stored in class static area and it has only i coppy

		A a1 = b1;//upcasting 1
		a1.m1();//we cannot ovveride


		A a2 = new B();//upcasting 2
		a2.m1();//we cannot ovveride

	}
}
