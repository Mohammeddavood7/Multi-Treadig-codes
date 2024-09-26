package com.april02.multithreadingclass;

class Table
{
	
	public synchronized void printTable(int num)
	{
		for(int i = 1 ; i <= 10 ; i++)
		{
			System.out.println(num +" * "+ i +" = "+ (num*i));
		}
		System.out.println("------------------------------------");
	}
	
}



public class ProjectLevelWithObjectSynchronization
{
    public static void main(String[] args)
    {
    	Table t1 = new Table();
    	Table t2 = new Table();
    	
    	 new Thread()
    	{
    		@Override
    		public void run()
    		{
    			t1.printTable(2);
    			
    		}
    			
    	}.start();
    	
    	 new Thread()
     	{
     		@Override
     		public void run()
     		{
     			t1.printTable(4);
     			
     		}
     			
     	}.start();
     	
     	
     	 new Thread()
      	{
      		@Override
      		public void run()
      		{
      			t2.printTable(1);
      			
      		}
      			
      	}.start();
      	
      	
      	 new Thread()
      	{
      		@Override
      		public void run()
      		{
      			t1.printTable(3);
      			
      		}
      			
      	}.start();
 		
     	
     	
	}
}

































