class static_blocks 
{
	static {
		System.out.println("this is static block-1, it will execute before main method");
	}

	static {
		System.out.println("this is static block-2, it will execute before main method");
	}


	static {
		System.out.println("this is static block-3, it will execute before main method");
	}


	public static void main(String[] args) 
	{
		System.out.println("this is main method");
	}
}
