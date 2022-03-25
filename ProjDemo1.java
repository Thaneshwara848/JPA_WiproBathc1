import java.util.*;
abstract class Emp
{
	String name;
	int age;
	int salary;
	String designation;
	static int count=0;
	Emp()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\n Enter name :");
		name=sc.nextLine();
		System.out.print("\n Enter Age :");
		age=sc.nextInt();
		
		
	}
	public void display()
	{
		System.out.println("\nNAME:"+name+ "\nAGE:"+age+ "\nSALARY:"+salary+"\nDESIGNAION:"+designation);	
	}
	public abstract void riseSalary();
}

final class Clerk extends Emp
{
	public Clerk()
	{
		salary=10000;
		designation="Clerk";
	}
	public void riseSalary()
	{
		salary=salary+5000;
		
	}
}

final class Programmer extends Emp
{
	public Programmer()
	{
		salary=20000;
		designation="Programmer";
	}
	public void riseSalary()
	{
		salary=salary+10000;
		
	}
}
final class Manager extends Emp
{
	public Manager()
	{
		salary=70000;
		designation="Manager";
	}
	public void riseSalary()
	{
		salary=salary+20000;
		
	}
}

public class ProjDemo1
{
	public static void main(String args[])
	{
	int ch1=0,ch2=0;
	Manager m=null;
	Programmer p=null;
	Clerk c=null;
	Emp e[]=new Emp[100];
	ArrayList al=new ArrayList();
	do{
		System.out.println("--------------------------------");
		System.out.println("1.creat");
		System.out.println("2.Display");
		System.out.println("3.RiseSalary");
		System.out.println("4.Exit");
		System.out.println("--------------------------------");
		System.out.println("Enter your Choice: ");
		Scanner sc1=new Scanner(System.in);
		ch1=sc1.nextInt();
		if(ch1==1){
			do{
				System.out.println("--------------------------------");
				System.out.println("1.Clerk");
				System.out.println("2.Programer");
				System.out.println("3.Manager");
				System.out.println("4.Exit");
				System.out.println("--------------------------------");
				System.out.println("Enter your Choice: ");
				Scanner sc2=new Scanner(System.in);
				ch2=sc2.nextInt();
				switch(ch2){
					case 1:	e=new Clerk();
						break;
					case 2:
						e=new Programmer();
						break;
					case 3:
						e=new Manager();
						break;
					}
				}while(ch2!=4);
		}
		if(ch1==2)
		{
			Iterator i=al.iterator();
			while(i.hasNext())
			{	
				System.out.println(i.next());
			}
			
		}

		if(ch1==3)
		{
			
		}
	}while(ch1!=4);
		System.out.println("Total no. of Employees Created:"+Emp.count);
	}
}

