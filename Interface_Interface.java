interface A
{
	int sum(int a,);
}


interface B extends A
	{
	void sub();
	}


class C implements B
{
	public void sum(int...arr)
	{
		int sum = 0;
		for (int a : arr )
		{
			sum =  sum +a;
		}
		System.out.println(sum);
	}


	public void sub()
	{
		System.out.println("this is abstarct method");
	}
}


class Interface_Interface
{
	public static void main(String[] args) 
	{
		C c1 = new C();
		c1.sum();
		c1.sub();

		System.out.println("=============================");
	}
}
