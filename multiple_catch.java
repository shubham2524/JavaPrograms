class multiple_catch
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
		catch ( ArrayIndexOutOfBoundsException  e )
		{
			System.out.println("exception handled" +e);

		}


		catch (Exception  e )
		{
			System.out.println("exception handled" +e);

		}


		catch (ArithmeticException  e )
		{
			System.out.println("exception handled" +e);

		}
	}
}
