package com.april17.MultiThreading;

public class HealthcareSystem 
{
	public static void main(String[] args) 
	{
		Patient pat  = null;
		
		for(int i = 1 ; i <= 5 ; i++)
		{
			pat = new Patient(i);
			Thread thread1 = new Thread(pat);
			thread1.start();
			try 
			{
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

