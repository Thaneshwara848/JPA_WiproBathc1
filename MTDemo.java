class Car1 extends Thread
{
	public synchronized  void run()
	{
		try
		{
			for(int i=0;i<=5;i++)
			{
				System.out.println(Thread.currentThread().getName()+" : "+ i);
				Thread.sleep(1000);
			}
		}
		catch(Exception ie){}
	}
}

class MTDemo
{
	public static void main(String args[])
	{
		
		Car1 c1=new Car1();

		Thread t1=new Thread(c1);
		Thread t2=new Thread(c1);
		t1.start();
		t2.start();
		t1.setName("Rama");
		t2.setName("Seetha");
		
		
			
	
	}
}














