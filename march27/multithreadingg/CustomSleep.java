package com.march27.multithreadingg;

class Myclass4 extends Thread
{
	
	@Override
	public void run()
	{
		
		for(int i = 1; i <= 10 ; i++)
		{
					
		        try 
		        {
		           Thread.sleep(2000,999999 ); // Sleep for 2 milliseconds and 500 nanoseconds
		            System.out.println("Woke up after custom sleep.");
		        }
		        catch (InterruptedException e)
		        {
		            e.printStackTrace();
		        }
		}
	}
	
}



public class CustomSleep 
{
    public static void main(String[] args)
    {
    	
    	Myclass4 mc  = new Myclass4();
    	mc.start();
       
    }

   
}
