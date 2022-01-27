class Try_catch_finaly
{
	public static void main(String[] args) 
	{
		int i,j,k;
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

		finally
		{
			System.out.println("finnaly exception handled" );
		}	

		
	}
}
