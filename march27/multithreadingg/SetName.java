package com.march27.multithreadingg;

class Myclass1 extends Thread
{
	  @Override
	  public void run()
	  {
		  String name = Thread.currentThread().getName();
		  System.out.println("Name of the thread: "+name);
		  
	  }
}


public class SetName
{
	public static void main(String[] args) 
	{
		Thread name = Thread.currentThread();
		name.setName("PARENT");
		System.out.println("Name of the thread: "+name.getName());
        
		Myclass1 mc = new Myclass1();
		mc.setName("CHILD1");
		mc.start();
		
		Myclass1 mc1 = new Myclass1();
		mc1.setName("CHILD2");
		mc1.start();
		
	}

}






































