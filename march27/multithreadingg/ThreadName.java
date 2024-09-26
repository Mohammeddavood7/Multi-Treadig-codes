package com.march27.multithreadingg;

class Myclass extends Thread
{
	@Override
	public void run()
	{
		String name = Thread.currentThread().getName();
		System.out.println("Name of the child thread: "+name);
	}
}


public class ThreadName 
{
	public static void main(String[] args)
	{
		String name = Thread.currentThread().getName();
		System.out.println("Name of the MainMethod: "+name);
		Myclass mc = new Myclass();
		mc.start();
	}

}




























































































