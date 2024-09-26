package com.march30.multithreadinglabtask;

public class Test extends Thread 
{
   static String name = "ravi";

	public static void main(String args[]) 
	{
		Test t = new Test();
		t.Test(name);
		System.out.print(" " + name);
	}

	public void Test(String name)
	{
	   start();
	   System.out.print(" method");
	}

	public void run() 
	{
	System.out.print(" run");
	}
}
