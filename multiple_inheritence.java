interface A
{
	void sum();
}


interface B
{
	void sub();
}


class C implements B,A
{
	public void sum()
	{
		System.out.println("this is 1-abstract method");
	}



	public void sub()
	{
		System.out.println("this is 2-abstract method");
	}
}

class multiple_inheritence 
{
	public static void main(String[] args) 
	{
		C c1 =  new C();
		c1.sum();
		c1.sub();

		A a1 =c1;//upcasting 
		a1.sum();


		B b1 = c1;//upcasing  
		b1.sub();

		System.out.println("===============================================");
	}
}
