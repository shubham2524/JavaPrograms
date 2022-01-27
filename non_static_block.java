class non_static_block 
{
	int a = 30;

	{
		System.out.println("this is non -static block");
	}

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		non_static_block nsb = new non_static_block();

	}
}
