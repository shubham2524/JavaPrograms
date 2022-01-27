import java.util.*;
class  stack
{
	public static void main(String[] args) 
	{
		Stack s=new Stack();
		s.push(10);//adding the elements 
		s.push(20);
		s.push(30);
		System.out.println(s);
		s.pop();//used to remove elements 
		System.out.println(s);
		System.out.println(s.peek());

		//for converting the stack into array
		ArrayList a = new ArrayList(s);
		l.remove(0);

	}
}
