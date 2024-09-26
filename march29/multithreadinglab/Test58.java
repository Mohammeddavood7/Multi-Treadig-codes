package com.march29.multithreadinglab;

/*class Test4
{
   public static void main(String []argv)
   {
      Thread t = Thread.currentThread();
      System.out.println("Name of current thead : "+t.getName());
      t.setName("First Thread");
      System.out.println("Name of thread after change : "+t.getName());
   } 
}
*/

/*
public class Test58 
{
	public static void main(String[] args) 
	{
		
	}
	System.out.println("Hello World!");
}*/



/*public class Test58 extends Thread
{
	public static void main(String argv[])
	{
		Test58 b = new Test58();
		b.run();
		b.start();
	} 
	
	@Override
	public void start()
	{
		for (int i = 0; i < 10; i++)
		{
		   System.out.println("Value of i = " + i); 
		}  
	}
} */

/*class MyThreadA1 extends Thread
{
	String s;
	public void run(String s) 
	{ 
		this.s=s;
		for (;;) 
		{
			System.out.println("s will be printed :"+s);
		}
	}
}
class MyThreadB1 extends Thread 
{
	String t;

	public void run(String t) 
	{ 
		this.t=t;
		for (;;) 
		{
			System.out.println("t will be printed :"+t);
		}
	}
}
public class Test58
{
public static void main(String [] args) 
{
  MyThreadA1 t1 = new MyThreadA1();
  MyThreadB1 t2 = new MyThreadB1();
		t1.start(); //no output
		t2.start(); //no output
		
	}
}*/




























































