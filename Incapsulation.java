class A
{
	private int eid;
	public int geteid()
	{
		return eid;
	}

	A (int eid)
	{
		this.eid =eid;
	}

	public void seteid(int eid)
	{
		this.eid =eid;
	}
}

class Incapsulation
{


	public static void main(String[] args) 
	{
		A a1 = new A(10);

		System.out.println(a1.geteid());

		a1.seteid(20);

		System.out.println(a1.geteid());

	}
}
