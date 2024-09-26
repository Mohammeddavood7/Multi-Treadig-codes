package com.april04.test;

public class ThreadGroupClass
{
	public static void main(String[] args) 
	{
		ThreadGroup myGroup = new ThreadGroup("Parent Group");
		 MyRunnable myRunnable = new MyRunnable();
		Thread thread1 = new Thread(myGroup,myRunnable,"child1");
		Thread thread2 = new Thread(myGroup,myRunnable,"child2");
		Thread thread3 = new Thread(myGroup,myRunnable,"child3");
		Thread thread4 = new Thread(myGroup,new Myclass011(),"child4");
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		//Thread.sleep(2000);
		System.out.println("Total Number of count: "+myGroup.activeCount());
		System.out.println("THREAD GROUP NAME: "+myGroup.getName());
		
	}

}

class MyRunnable implements Runnable
{
	@Override
	public synchronized void run()
	{
		for(int i=1;i<=3;i++)
		{
		      System.out.println(i);
		}
	}
}



class Myclass011 extends Thread
{
	@Override
	public void run()
	{
		System.out.println("Myclass 01 invoked");
	}
}



























































