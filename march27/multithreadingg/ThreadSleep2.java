package com.march27.multithreadingg;

class Myclass3 extends Thread
{
	
	@Override
	public void run()
	{
		for(int i = 1 ; i <= 10 ; i++)
		{
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			System.out.println(i+" by "+Thread.currentThread().getName());
		}
	}
}
public class ThreadSleep2
{
	public static void main(String[] args)
	{
		System.out.println("Parent: "+Thread.currentThread().getName());
		Myclass3 mc1 = new Myclass3();
		mc1.setName("child - 1: ");
		mc1.start();
		
        Myclass3 mc2 = new Myclass3();
        mc2.setName("child - 2: ");
		mc2.start();
		
		
		
	}
	

}


































