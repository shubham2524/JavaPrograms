class this1 
{

	int a;
	int b ;
	int c;
	int sum = 0;
	public void add(int a,int b,int c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
		 sum = a+b+c;
		 System.out.println(sum);
	}
}
class driven
{


	public static void main(String[] args) 
	{
		this1 t = new this1();
		t.a=10;
		t.b = 20;
		t.c =30;

		System.out.println(t.a);
		System.out.println(t.b);
		System.out.println(t.c);
		t.add(10,20,30);
	}
}
