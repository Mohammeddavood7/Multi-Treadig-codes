package com.april03.mulltithreading;

class WaitSleep extends Thread
{
	int var = 0;
	public void run()
	{
		for(int i = 0; i <= 10; i++)
		{
			var += i;
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}

public class DiffBlwWaitAndSleep
{
	public static void main(String[] args) throws InterruptedException
	{
		
		WaitSleep dws = new WaitSleep();
		Thread thread1 = new Thread(dws);
		thread1.start();
		System.out.println("-------------------");
		Thread.sleep(1000);
		System.out.println(dws.var);
		
	}
}





















































































