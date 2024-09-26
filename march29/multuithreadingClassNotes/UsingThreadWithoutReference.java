package com.march29.multuithreadingClassNotes;

public class UsingThreadWithoutReference 
{
	public static void main(String[] args)
	{
	    new Thread()
		{
			@Override
			public void run()
			{
				System.out.println("thread is running..");
			}
			
		}.start();
		
	}

}
