package com.april03.mulltithreading;


class WaitObjectClass extends Thread
{
	int var = 0;
	public void run()
	{
		synchronized(this)
		{
		for(int i = 0; i <= 10; i++)
		{
			var += i;
			try 
			{
				Thread.sleep(200);
			} 
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("nofied");
			
			notify();
		}
			
		}
	}

}

public class WithWaitObject 
{
	public static void main(String[] args) 
	{
		
		WaitObjectClass dws = new WaitObjectClass();
		Thread thread1 = new Thread(dws);
		thread1.start();
		
		synchronized(dws) //lock is taken by the main thread
		{
			
			try //main thread lock is suspend by the thread scheduler 
			{
				dws.wait(); //main thread is wait and release lock
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		
		System.out.println(dws.var);
		
	}
}


































































































