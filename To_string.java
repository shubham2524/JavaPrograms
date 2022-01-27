class To_string 
{
	int eid;
	To_string(int eid)
	{
		this.eid = eid;
	}
	public String toString ()
	{
		return "eid"+eid;
	}
	public static void main(String[] args) 
	{
		To_string  ts = new To_string (10);
		

		System.out.println(ts);
	}
}
