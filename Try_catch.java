class Try_catch 
{
	public static void main(String[] args) 
	{
		int i,j,k=0;
		i = 5;
		j= 0;
		try
		{
			k =i/j;
			
		}
		catch (ArithmeticException  e )
		{
			System.out.println("exception handled" +e);

		}


		catch (Exception  e )
		{
			System.out.println("exception handled" +e);

		}





		System.out.println(k);
		

		
	}
}
