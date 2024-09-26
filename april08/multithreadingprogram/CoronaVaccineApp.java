package com.april08.multithreadingprogram;

public class CoronaVaccineApp 
{
	public static void main(String[] args) throws InterruptedException
	{

	User user1 = new User("smith", 20, false);
	User user2 = new User("miller", 17,false);
	
	Thread thread1 = new Thread()
	{
		@Override
		public void run()
		{
				user1.isEligible();
				user1.bookDose();
				user1.isDoseBooked();
			    
		}
		
	};
	
	
	Thread  thread2 = new Thread()
	{
		
		@Override
		public void run()
		{
			user2.isEligible();
			user2.bookDose();
			user2.isDoseBooked();	
		}
		
    };
    
       thread1.start();
       thread1.join();
       System.out.println("-------------------");
       thread2.start();
       thread2.join();
       
	}
}














































