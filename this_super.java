class A 
{
	String a ="shubham";

}

class B extends A
{
	String  a = "saurabh";
	 void method1()
	{
	
	System.out.println(a);//child class
	System.out.println(this.a);//hold the memeory address of  current  variable  
	System.out.println(super.a);//hold the memory address of parent class.
	
	}

} 
class this_super extends B
{
	public static void main(String[] args) 
	{
		B obj  =  new B();
		obj.method1();
			
	}
}
