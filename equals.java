class equals 
{
	int eid ;
	equals(int eid)
	{
		this.eid= eid;
	}
	public String toString()
	{
		return "eid"+eid;
	}
	/*public boolean equals (Object obj)
	{
		return this.eid==((equals)obj).eid;
	}*/
	
	public static void main(String[] args) 
	{
		equals eq = new equals(1);
		equals eq1 = new equals(1);
		System.out.println(eq.equals(eq1));//downcasting
	}
}
