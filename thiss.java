class A
{
A(int a )
{
	this();//this keyword checks constructor with zero parameter in same class
	System.out.println("bye");
}
A()
	//super (); created by jvm during the compilation
{
	System.out.println("hello");
}
	



}
class thiss
{
   public static void main(String[] args) 
	{
		A a = new A(10);
	}
}
