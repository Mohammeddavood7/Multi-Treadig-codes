package com.march29.multuithreadingClassNotes;

public class UsingThreadReference
{
	public static void main(String[] args)
	{
		Thread thread = new Thread()
		{
			@Override
			public void run()
			{
				System.out.println("thread is running..");
			}
			
		};
		thread.start();
		
	}

}
