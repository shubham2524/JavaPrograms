class A 
{
	int i;
	A()
	{
		System.out.println("constructor-1");

	}
}


class B 
{
	int i;
	B()
	{
		System.out.println("constructor-2");

	}
}
class Multiple extends B//,A
{
	/*Multiple()
	{
		super();
		System.out.println("default constructor");
	}



	-it is not possible because when be execute the main method there is default constructor created and the super call statement created 
	so it will refer to super class and there is two super class so AMBIGUITY  is there.

	- we cannot pass two class after extend keyword .

*/

	public static void main(String[] args) 
	{
		System.out.println("multiple inheritance is not used by class ");
	}
}
