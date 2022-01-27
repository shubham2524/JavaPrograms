class string_builder 
{
	public static void main(String[] args) 
	{
		
		StringBuilder sb = new StringBuilder("hello");
		System.out.println(sb.append(" all"));// for concate  modification done on current object 
		System.out.println(sb);
	}
}
