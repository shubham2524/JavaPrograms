class equals_method
{
	public static void main(String[] args) 
	{
		String s ="rama";
		String s1 = "rama";

		System.out.println(s.equals(s1)); //checking string value 

		String s4 ="Rama";
		String s3 = "rama";
		System.out.println(s4.equalsIgnoreCase(s3));//true donot compare ashiqui value 
	}
}