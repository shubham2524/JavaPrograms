class reverse_sentence 
{
	public static void main(String[] args) 
	{
		String s = "how are you";
		String s2 [] = s.split(" ");
		String s3 = "  " ;
		for (int i =0;i<s2.length ;i++ )
		{
			s3 = s2[i]+"  "+s3;
		}
		System.out.println(s3);
	}
}
