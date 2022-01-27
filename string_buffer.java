class string_buffer 
{
	public static void main(String[] args) 
	{
		
		StringBuffer sb = new StringBuffer("hello");
		System.out.println(sb.append(" all"));// for concate  modification done on current object 
		System.out.println(sb);
	}
}
