class call_non_static_variables 
{
	int a ;
	public static void main(String[] args) 
	{
		non_static_variables obj = new  non_static_variables();

		System.out.println(obj.a);
		System.out.println(obj.b);
	}
}
class demo
{
	int b = 100;
}
