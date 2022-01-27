class circle223 
{
	public static void main(String[] args) 
	{
		circle223 obj = new circle223();
		obj.non_static_method();
	}
	public void non_static_method()
	{
		int r  = 10;
		double area = 3.14*r*r;
		System.out.println(area);
	}

	
}


