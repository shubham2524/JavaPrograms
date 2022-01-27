class  Assignment2
{
	public static void main(String[] args) 
	{ 
		int a = 5;
		int b = 4;
		int c = 3;
		int d = 1;
		if (a<b)
		{
			if (a<c)
			{
				if (a<d)
				{
					System.out.println(a+" is smallest");
				}
			}
		}
		 else if (b<a)
		{
			if (b<c)
			{
				if (b<d)
				{
					System.out.println(b+" is smallest");
				}
			}
		}

		 else if (c<a)
		{
			if (c<b)
			{
				if (c<d)
				{
					System.out.println(c+" is smallest");
				}
			}
		}

		else  if (d<a)
		{
			if (d<b)
			{
				if (d<c){
		           System.out.println(d+" is smallest");
				}
		}
		}
	}
}
