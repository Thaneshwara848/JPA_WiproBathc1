import java.io.*;
class IoDemo
{
	public static void main(String args[]) 
	{	
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.print("ENter Name : ");
			String name=br.readLine();

			System.out.print("ENter Age  : ");
			String age=br.readLine();

			System.out.print("ENter Salary  : ");
			String salary=br.readLine();

			System.out.print("My  Name is : "+name);
			System.out.print("My  Age is : "+age);
			System.out.print("My  Saalry is : "+salary);
		}
		catch( IOException io)
		{	
			System.out.println(io);
		}
	}
}
		