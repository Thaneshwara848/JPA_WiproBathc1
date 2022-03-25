import java.io.*;
class IoDemo2
{
	public static void main(String args[]) 
	{	
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
			System.out.print("Enter File Name  : ");
			String fname = br.readLine();

			File f =new File(fname );
			if(f.exists())
			{
				BufferedReader  fr=new BufferedReader(new FileReader(fname));
				   int i;    
          					while((i=fr.read())!=-1)    
					{
         						 System.out.print((char)i); 
					}   
			}
			else
			{
				System.out.println("Sorry File does not exists  ");	
			}
			
		}
		catch( IOException io)
		{	
			System.out.println(io);
		}
		
	}
}		