package com.march27.multithreadingg;


class Sample1 extends Thread
{
	@Override
	public void run()
	{
		String name = Thread.currentThread().getName();
		for(int i=1; i<=10; i++)
		{
		   System.out.println(i+" by "+name+ " thread");
		}
	}
}
public class ThreadLoop 
{	
	public static void main(String[] args) 
	{
	   System.out.println("Main Thread Started!!!");
	   
	   Sample1 s1 = new Sample1();  s1.start();
	   
	   
	   String name = Thread.currentThread().getName();
	   
	   for(int i=1; i<=10; i++)
	   {
		   System.out.println(i+" by "+name+ " thread");
	   }
	   
	   int x = 1;
	   do
	   {
		   System.out.println("India");
		   x++;
	   }
	   while(x<=10);
	   
	   
	}
}
