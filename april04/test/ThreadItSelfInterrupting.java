package com.april04.test;



class MyClass02 extends Thread
{
	public void run()
	{
		
		   
			
			try 
			{
				Thread thread = Thread.currentThread();
				 thread.interrupt();
			    for(int i=1;i<=5;i++)
				{
				  System.out.println(thread.getName()+" invoked");
				  Thread.sleep(1000);
				}

				
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
	}
	
}

public class ThreadItSelfInterrupting 
{
	public static void main(String[] args)
	{
		Thread mc =  new Thread(new MyClass02(),"childing");
		mc.start();
		
		
	}

}






























