import java.util.*;
class queues
{
	public static void main(String[] args) 
	{
		LinkedList l =new LinkedList();
		l.offer(10);
		l.offer(20);
		l.offer(30);
		l.offer(45);

		System.out.println(l);
		l.poll();
		System.out.println(l);

	}
}
