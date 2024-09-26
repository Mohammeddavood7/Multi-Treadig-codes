package com.march29.multuithreadingClassNotes;

public class UsingRunnableInterfaceWithoutReference
{
	public static void main(String[] args) 
	{ 
		new Thread(
				new Runnable()
				{

					@Override
					public void run()
					{
						System.out.println("thread is UsingRunnableInterfaceWithoutReference running");
						
					}
					
				}
				
				).start();
	}

}
