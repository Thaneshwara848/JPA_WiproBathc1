import java.io.*;
class IoDemo3
{
	public static void main(String args[]) 
	{	
		
		try
		{
			File dir1=new File("abc");
			dir1.mkdir();
			
			File dir2 = new File(dir1,"xyz");
			dir2.mkdir();

			File f=new File(dir2,"emp.txt");
			f.createNewFile();

			PrintWriter pw =new PrintWriter(new FileOutputStream(f,true));
			pw.println("Hello EveryBody , Just Fro Demo just to check ");

			pw.flush();
			pw.close();
		}
		catch(Exception io)
		{	
			System.out.println(io);
		}	
	}
}		