class Listof_primeno 
{
	public static void main(String[] args) 
	{
		for (int i = 2;i<=100 ;i++ )
		{
			
			for (int j = 2;i<j ;j++ )
			{
				if (i%j ==0)
				{
					System.out.println (i+ "number is prime");

				}
			}
		}
		
	}
}
