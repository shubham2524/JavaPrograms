class string 
{
	public static void main(String[] args) 
	{
		String s = "hello";
		String s1 = new String("hello");
		String s2 = new String ("hello");
		
		System.out.println(s);
		System.out.println(s1==s2);
		System.out.println(s1);//overriden tostring()  method....
		s1 = s1.concat("all");
		System.out.println(s1);
		s1 ="bye";//no objecyt is created in the heap area  thst is why tis is faster.
		System.out.println(s1);
	}
}
