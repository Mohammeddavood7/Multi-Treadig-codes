package com.march27.multithreadingg;

class Sample extends Thread
{
     @Override
     public void run()
     {
    	 String name = Thread.currentThread().getName();
    	 for(int i=1 ; i<=10 ;i++)
    	 {
    	    System.out.println(i+" child class: "+name);
    	 }
     }
}

public class Test1
{
	public static void main(String[] args) 
	{
		Sample s1 = new Sample();
		s1.start();
		
		String name = Thread.currentThread().getName();
		
		for(int i = 1 ;i <= 10 ; i++)
		{
			System.out.println(i+" parent class: "+name);
		}
		
		
		
		
		int x = 1;
	   do {
		   
		   System.out.println("indian");
		   x++;
	   }while(x <= 10);
		
	}
}































































