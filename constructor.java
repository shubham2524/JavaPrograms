class constructor
{
	int a ;
	int b ;
	int c ;
	constructor(int a,int b,int c)
		{


		this.a = a;
		this.b = b;
		this.c = c;

		
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(this.c);
		
		}


	public static void main(String[] args) 
	{
		constructor c1 =  new constructor(10,20,30);
		constructor c2 =  new constructor(50,60,70);
		constructor c3 =  new constructor(40,80,90);
		

	}
}
