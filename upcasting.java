class A
{
	int i;
}
class B extends A
{
	int j;
}



class upcasting 
{
	public static void main(String[] args) 
	{

		B b =  new B ();

		System.out.println(b.i);
		System.out.println(b.j);


		A a = new A();
		System.out.println(a.i);
		//System.out.println(a.j);

		System.out.println(a);
		System.out.println(b);



		/* int a = 10;
		double b =a ;

		it will gives output in double*/

		A a1 = b;//upcasting   here the  address of sub class is stored in  super class
		System.out.println(a1);

		System.out.println(a1.i);
		//System.out.println(a1.j);


		B b2 =  new B ();
		A a3 =  b2;//upcasting here also


		System.out.println(b2);
		System.out.println(a3);


	
	
	
	
	
	
	}



}
