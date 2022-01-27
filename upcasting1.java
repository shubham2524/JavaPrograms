class D 
{
	int i;
}

class  E extends D 
{
	int j;
}

class F extends D
{
	int k;
}


class upcasting1
{
	public static void main(String[] args) 
	{
		D obj1 =  new F();//upcasting 
		F f1 = (F) obj1 ;//downcasting
		System.out.println(f1.k);


	}
}
