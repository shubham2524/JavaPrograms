//wap a program to count number of a in word karnataka
class question1
{

	public static void main(String[] args) 
	{
		String s= "karnataka";
	char a [] =s.toCharArray();
	int count = 0;
	for (int i =0;i<a.length ;i++ )
	{
		if (a[i]=='a')
		{
			count ++;
		}

	}
		System.out.println("no. of a present in karnatka is :-"+count);
	}
}
