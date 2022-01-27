class demo2
{
	static int a = 10;
	public static void main(String[] args) 
	{
		System.out.println(a);//directly
		System.out.println(demo2.a);//by class name
		demo2 obj = new demo2();
		System.out.println(obj.a);//by object creation
	}
}
