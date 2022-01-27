class array 
{
	public static void main(String[] args) 
	{
		int [] a = {1,2,3,4,5};

		System.out.println(a.length);
		System.out.println(a[2]);
		System.out.println(a);//refrance address
		//System.out.println(a[6]); ARRAY INDEX OUT OF BOUND EXCEPTION
		//System.out.println(a[0]);  Null point exception



		for (int i = 0;i<a.length ;i++ )
		{
			System.out.print(a[i]);
		}
	}
}
