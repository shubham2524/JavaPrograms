class emp //we can strore the obj refrance in to array
{
		String name;
		int eid;

		emp (String name,int eid)
		{
			this.name = name;
			this.eid =eid;
		}
		
	public static void main(String[] args) 
	{
		emp e1 = new emp ("shubham",101);
		emp e2 = new emp ("rohit",102);
		emp e3 = new emp ("raushan",103);
		emp a [] = new emp[3];
		a[0] = e1;
		a[1] = e2;
		a[2] = e3;
		for (int i = 0;i<a.length ;i++ )
		{
			System.out.println(a[i].name+ "  "+a[i].eid);
		}



		
	}
}
