import java.io.*;
import java.util.*;

class Emp
{
	String name;
	int age;
	int salary;
	String desig;
	Emp()
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("Enter name : ");
			name = br.readLine();
			System.out.print("Enter age : ");
			age = Integer.parseInt(br.readLine());
			System.out.print("Enter salary : ");
			salary = Integer.parseInt(br.readLine());
			System.out.print("Enter designation : ");
			desig = br.readLine();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void display()
	{
		System.out.println("\nName : "+name);
		System.out.println("Age : "+age);
		System.out.println("Salary : "+salary);
		System.out.println("Designation : "+desig);
	}
}
public class ProjDemo
{
	public static void main(String args[])
	{
		try
		{
		
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int ch=0;
			ArrayList<Emp>  list = new ArrayList<Emp>();
			do
			{
				System.out.println("-----------------");
				System.out.println(" 1.  Create ");
				System.out.println(" 2.  Display ");
				System.out.println(" 3.  Exit ");
				System.out.println("-----------------");
				System.out.print("Enter choice : ");
				ch = Integer.parseInt(br.readLine());
				if(ch==1)
					list.add(new Emp());
				if(ch==2)
				{
					Iterator<Emp> e = list.iterator();
					while(e.hasNext())
					{
						e.next().display();
					}
				}
			}while(ch!=3);
			
		}
		catch(Exception e )
		{
		}	
		
	}
}
