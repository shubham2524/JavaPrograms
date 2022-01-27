class demo3 
{
	int a ;//non static
	
	public void method1()
	{
		int c = 10;
		int b = 20;
		int add = c+b;
		System.out.println(add);
	}



	public static void main(String[] args) 
	{
		demo3 obj  = new demo3();//object creation

		System.out.println(obj.a);//calling non static variable.

		obj.method1();//calling method of same class



		demo4 obj1 = new demo4();//object creation of different class 

		System.out.println(obj1.x);//calling variables of different class 
		
		obj1.method2();//calling method of different class
	}
}
class demo4
{
	int x = 1000;
	public void method2()
	{
		int z = 1000;
		int y  = 2000;
		int add = y+z;
		System.out.println(add);
	}

}
