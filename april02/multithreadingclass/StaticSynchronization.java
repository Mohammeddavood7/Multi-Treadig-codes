package com.april02.multithreadingclass;



class Table1
{
	
	public static synchronized void printTable(int num)
	{
		for(int i = 1 ; i <= 10 ; i++)
		{
			System.out.println(num +" * "+ i +" = "+ (num*i));
		}
		System.out.println("------------------------------------");
	}
	
}



public class StaticSynchronization
{
    public static void main(String[] args)
    {
    	
    	
    	 new Thread()
    	{
    		@Override
    		public void run()
    		{
    			Table1.printTable(2);
    			
    		}
    			
    	}.start();
    	
    	 new Thread()
     	{
     		@Override
     		public void run()
     		{
     			Table1.printTable(4);
     			
     		}
     			
     	}.start();
     	
     	
     	 new Thread()
      	{
      		@Override
      		public void run()
      		{
      			Table1.printTable(1);
      			
      		}
      			
      	}.start();
      	
      	
      	 new Thread()
      	{
      		@Override
      		public void run()
      		{
      			Table1.printTable(3);
      			
      		}
      			
      	}.start();
 		
     	
     	
	}
}


































