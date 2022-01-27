class employee
{
	private String name;
	private int eid;
	private double salary;
	private String designation;
	

employee(String name,int eid,double salary,String designation)
{
	this.name = name;
	this.eid = eid;
	this .salary= salary;
	this.designation = designation;
}
	public String getname()
	{
		return name;
	}

	public int geteid ()
	{
		return eid;
	}


	public double getsalary()
	{
		return salary;
	}


	public String getdesignation()
	{
		return designation;
	}


	


	public void setname(String name)
	{
		this.name = name;

	}
	public void setsalary(double salary)
	{
		if (salary>this.salary)
		{
			this.salary= salary;
			System.out.println("salary updated successfully..!");
		}

	}
}

class Incapsulation1 
{
	public static void main(String[] args) 
	{
		employee emp = new employee("shubham",202,20000,"cm");
	
		emp.setsalary(30000);
		employee emp1 = new employee("saurabh",203,30000,"asso.soft eng");
		display(emp);
		display(emp1);	

	}
		public static void display(employee e)
		{
		
		System.out.println(e.getname());
		System.out.println(e.geteid());
		System.out.println(e.getsalary());
		System.out.println(e.getdesignation());
		}
		
}
