import java.util.*;
import java.io.*;
class Demo
{
	void abc()  throws FileNotFoundException,ArithmeticException,NullPointerException
	{
		for(int age=0;age<=20;age++) 
		{
			if(age == 18)  throw new ArithmeticException(); 
			if(age == 10)  throw new NullPointerException(); 
			if(age==5) throw new FileNotFoundException();
			System.out.println("i : "+age);	

		}	
	}
}
class EHDemo1
{
	public static void main(String args[]) 
	{
		try
		{
			Demo d=new Demo();
			d.abc();
		}
		catch( ArithmeticException ar)
		{
			System.out.println("A E came ");
		}
		catch( FileNotFoundException fnf)
		{
			System.out.println(" FileNotFoundExecption came ");
		}
		catch(NullPointerException np)
		{
				System.out.println("N p  came ");	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Thanks for yousing this application ");
		}		
	}	
}













	