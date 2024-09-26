package com.april03.mulltithreading;

class nofityAllObject
{
	boolean flag = false;
	
	public synchronized void waitMethod()
	{
		String name = Thread.currentThread().getName();
		System.out.println("wait");
		
		while(!flag)
		{
			try 
			{
				System.out.println(name+" thread waiting.");
				wait();
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		String name1 = Thread.currentThread().getName();
		System.out.println(name1+" thread completed.");
     }
		
		
	
	
	public synchronized void setMethod()
	{
		System.out.println("notifed all");
		flag = true;
        System.out.println(Thread.currentThread().getName() + " has make flag value as a true");
		notifyAll();
	}
	
	
}

public class WithNofiedAll2
{
	public static void main(String[] args) throws InterruptedException
	{
		nofityAllObject wn2 = new nofityAllObject();
		
		Thread thread1 = new Thread(()-> wn2.waitMethod(),"child1");
		
		Thread thread2 = new Thread(()-> wn2.waitMethod(),"child2");
         
		Thread thread3 = new Thread(()-> wn2.waitMethod(),"child3");
		
		Thread thread4 = new Thread(()-> wn2.setMethod(),"child4");

		
		thread1.start();
		thread2.start();
		thread3.start();
		
		Thread.sleep(2000);
		
		thread4.start();
		

		
	}
	

}







































