package com.march29.multuithreadingClassNotes;

public class UsingRunnableInterfaceWithLAMBDA_01 
{
	public static void main(String[] args)
	{
		 new Thread(() ->  System.out.println(Thread.currentThread().getName()),"ChildC1").start();
		
	}

}
