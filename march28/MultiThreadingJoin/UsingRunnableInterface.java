package com.march28.MultiThreadingJoin;

class RunIn implements Runnable
{
	@Override
	public void run()
	{
		System.out.println("RunIn implements to Runnable.... ");
	}
}




public class UsingRunnableInterface 
{
	public static void main(String[] args)
	{
		System.out.println("main thread started....");
		//RunIn ri = new RunIn();
		
		Thread thread = new Thread(new RunIn());
		thread.start();
		
		
	}

}
