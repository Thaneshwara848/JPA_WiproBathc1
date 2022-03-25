import java.util.*;
class ColDemo
{
	public static void main(String args[])
	{
			//ArrayList al=new ArrayList();
			//LinkedList al=new LinkedList();
			//HashSet al=new HashSet();/ no dup , no order
			//LinkedHashSet al=new LinkedHashSet(); // no dup but user enter order 
			//TreeSet al=new TreeSet(); // no dup + sorted order 
			//Hashtable map=new Hashtable(); // legasy class  no dup/ synchronised 
			 HashMap map=new HashMap(); // new added class not synchnrosed 
			//LinkedHashMap map=new LinkedHashMap(); // no dup + user entered order 
			//TreeMap map=new TreeMap(); //no dup + sorted order 
			map.put(100,"Thanesh");
			map.put(150,"Ramesh");
			map.put(120,"Rakesh");
			map.put(550,"Rajesh");
			map.put(320,"Mahesh");
			map.put(550,"Rajesh");
			map.put(320,"Prakash");
			Set set=map.entrySet();

			Iterator i=set.iterator();
			while(i.hasNext())
			{
				Map.Entry entry=(Map.Entry)i.next();
				System.out.println(entry.getKey() + " : "+entry.getValue());	
				//System.out.println(i.next());	
			}
			
				
	}
}