class Prime_number 
{
	public static void main(String[] args) 
	{
		int a = 1157;
		boolean flag = true;
		for (int i = 2;i<a ;i++)
		{
			if (a%i ==0)
			{
				flag  =false;
			}


		}
			if (flag == true )
		{
			System.out.println(a+"this is prime no");
		}
		else 
		{
			System.out.println(a+"this is not prime no");
		}
			
		
		
		
	}
}
