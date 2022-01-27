interface calculator
{
	public int add(int...arr);

}

class Remotecalculator implements calculator
{
	
	public int add(int...arr)
		
	{
		int sum =0;
		for(int a :arr)
		{
			sum = sum + a;
		}
	
	return sum;
	}
}





class varargs 
{
	public static void main(String[] args) 
	{
		calculator obj = new Remotecalculator();
		System.out.println(obj.add(10,30,50,40));

	}
}
