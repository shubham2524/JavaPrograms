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


class single_inheritence 
{
	public static void main(String[] args) 
	{
		B b =  new B();
		b.Add();
		b.Add1();
		System.out.println(b.i);
		System.out.println(b.j);

		//here we are creating object for parent class so it can not access child class member thats y it is showing CTE

		A  a =  new A();
		a.Add();
		//a.Add1();//CTE
		System.out.println(b.i);
		//System.out.println(b.j);//CTE 

	}
}
