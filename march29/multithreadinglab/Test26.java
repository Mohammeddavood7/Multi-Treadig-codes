package com.march29.multithreadinglab;

class Parrot implements Runnable
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" ");
	}
}
public class Test26
{
	static Parrot p;

	static { p=new Parrot();}

	{Thread t1= new Thread(p,"Peacock"); t1.start();} //peacock

	public static void main(String [] args)
	{
		new Test26();

		new Thread( new Runnable()
		{
			public void run()
			{
				;
			}
		},"Koyal").start();

		new Thread(new Parrot(),"Parrot").start(); //parrot
	}
	

	{
	  Thread t2 = new Thread(p,"Sparrow");t2.start(); //sparrow
	}

	}
