class continue1 //wap to print 1 to 10 except 5
{
	public static void main(String[] args) 
	{
		int i = 1;
		while (i<10)
		{
			
			if (i==5)
			{
				i++;
				continue;
			
				
			}
			System.out.println(i);

			i++;
		}
		
	}
}
