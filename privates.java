class privates 
{
	private int a ;
	private void methods()
	{
		System.out.println("this is private method");
	}
	public static void main(String[] args) 
	{
		privates pv = new privates ();
		pv.a = 10;

		System.out.println(pv.a);
		pv.methods();
	}
}
