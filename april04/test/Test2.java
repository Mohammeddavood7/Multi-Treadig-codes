package com.april04.test;

class MyClass01 extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			interrupt();
			Thread thread = Thread.currentThread();
			try 
			{
				
				System.out.println(thread.getName()+" invoked");

				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}

public class Test2 
{
	public static void main(String[] args)
	{
		Thread mc =  new Thread(new MyClass01(),"child-01");
		mc.start();
		
		
	}

}






























