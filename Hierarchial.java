class A 
{
	int i;	
	int j ;
}

class  B extends A 
{
	int k;	
	int l ;
}


class C extends A 
{
	int m;	
	int n ;
}

class Hierarchial 
{


	public static void main(String[] args) 
	{
		C c = new C();
		System.out.println(c.m);
		System.out.println(c.n);
		System.out.println(c.i);
		System.out.println(c.j);
	
		A a = new A ();
		//System.out.println(a.m);
		//System.out.println(a.n);parent class is  not able to accesss the properties and behavoiur of child class.
		System.out.println(a.i);
		System.out.println(a.j);

		B b = new B();
		//System.out.println(c.m);  there is no IS relationship between parent class and chilad class
		//System.out.println(c.n);
		System.out.println(c.i);
		System.out.println(c.j);


	}
}
