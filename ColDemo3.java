import java.util.*;
class ColDemo3
{
	public static void main(String args[])
	{
			LinkedList al=new LinkedList();
			//TreeSet al=new TreeSet();	
			al.add("C");
			al.add("B");
			al.add("A");
			al.add("D");
			al.add("Z");
			al.add("Y");

			Collections.sort(al);
			Collections.reverse(al);
			//Collections.shuffle(al);
			//Collections.swap(al,2,5);
			Iterator i=al.iterator();
			while(i.hasNext())
			{
				System.out.println(i.next());	
			}
			
				
	}
}