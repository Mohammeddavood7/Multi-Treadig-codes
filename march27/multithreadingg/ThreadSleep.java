package com.march27.multithreadingg;

class Myclass2 extends Thread
{
	@Override
	public void run()
	{
		for(int i = 0 ; i <= 10 ; i++)
		{
			System.out.println("i value is: "+i);
			
			try 
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		
		}
	}
}




public class ThreadSleep
{
	public static void main(String[] args)
	{
		Myclass2 mc = new Myclass2();
		mc.start();
		
	}

}






































