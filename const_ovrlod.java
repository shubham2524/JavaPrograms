class const_ovrlod
{
	const_ovrlod(){
		System.out.println("this is constructor without parameters");
		
	}
	const_ovrlod (int a){
		System.out.println("this is constructor with parameters");
	}
	
	const_ovrlod (int a,int b){
		System.out.println("this is constructor with parameters");
	}

	public static void main(String[] args) 
	{
		const_ovrlod cd1 = new const_ovrlod();
		const_ovrlod cd2 = new const_ovrlod(1);
		const_ovrlod cd3 = new const_ovrlod(1,2);
		
		
	}
}
