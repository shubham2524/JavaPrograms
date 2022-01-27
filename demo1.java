class demo1
{
	int a ;
	public static void main(String[] args) 
	{
		method1();//directly callling method


		demo1 d1 = new demo1();//object creation for same class

		System.out.println(d1.a);//calling variables of same class
	
		demo d2=new demo();// object creation of different class
		
		System.out.println(d2.b);//calling variables 

		d2.add();//calling method
	}
	public static void method1()
	{
		int x = 10;
		int y = 2;
		int multiply = x*y;
		System.out.println(multiply);
	}
}
class demo
{
	int b = 1001;


	
	public void add()
	{
		int d = 100;
		int c = 200;
		int sum = d+c;
		System.out.println(sum);
	}

}
