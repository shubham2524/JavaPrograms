class card 
{
	void make_payment()
	{
		System.out.println("making payment");
	}
}

class debitcard extends card
{
	void make_payment()
	{
		System.out.println("making payment through debit card");
	}

}
class creditcard extends card 
{
	void make_payment()
	{
		System.out.println("making payment through credit card");
	}
}
class swipe
{
	void swipingmachine (card c)
	{
		c.make_payment();
	}
}
class run_time_polymorphism
{

	public static void main(String[] args) 
	{
		debitcard db = new debitcard();
		swipe  s = new swipe();
		s.swipingmachine(db);//upcasting 


	}
}
