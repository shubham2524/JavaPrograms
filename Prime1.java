class Prime1 
{
	public static void main(String[] args) 
	{
		int n = 32;
		boolean primes = true;
		
			for (int i = 2;i<n ;i++ )
			{
				if (n%i==0)
				{
					primes = false;
				}
			}
		
	     
		 if (primes == true)
		 {
			 System.out.println(n +"  is a prime no" );
		 }
		 else 
			 System.out.println(n +  "is not a prime no");
    }
}
