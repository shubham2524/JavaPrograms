class A
{
	int i ;
}
class B extends A
{
	int j;

}

class C extends B
{
	int k;
}





class downcasting
{
	public static void main(String[] args) 
	{
		C c1 = new C();
		System.out.println(c1.i);
		System.out.println(c1.k);
		System.out.println(c1.j);


		B b1 =  new B();
		System.out.println(b1.i);
		System.out.println(b1.j);
		//System.out.println(b1.k);

		A a1 = new A();
		System.out.println(a1.i);



		A a2 = new C ();
		//System.out.println(a2.k);


		C c2 =(C) a2;
		System.out.println(c2.k);











	}
}
