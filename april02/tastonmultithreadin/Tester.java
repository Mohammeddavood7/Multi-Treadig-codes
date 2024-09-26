package com.april02.tastonmultithreadin;

class TicketDispenser
{
	int maxiSeat = 200;
	int allotedSeat;
	
	public TicketDispenser(int allotedSeat)
	{
		super();
		this.allotedSeat = allotedSeat;
	}
	
	public int allotSeatNumber()
	{
		
			if(allotedSeat <= maxiSeat)
			{
				++allotedSeat;   
			}

			if(allotedSeat > maxiSeat)
			{
				return -1;
			}
		return 1;
		
	}

}

public class Tester
{
	
	public static void main(String[] args) throws InterruptedException
	{
		 TicketDispenser td =   new TicketDispenser(0); 
		System.out.println("total available tickets: "+td.maxiSeat);
		Runnable r1 = ()-> 
		{
			Thread thread1 = Thread.currentThread();
			 int allotSeatNumber = 0;
			
			 for(int i=1;i <= 5;i++)
			{
				allotSeatNumber  = td.allotSeatNumber();
			}
			
			 if(allotSeatNumber == -1)
			  {
					System.err.println(thread1.getName()+" check you booked more than available: ");
			  }
			else
			{
					System.out.println(td.allotedSeat+"  booked  : "+thread1.getName()); 
			}
			
       
		};
		
		Thread thread1 = new Thread(r1,"child1");
		Thread thread2 = new Thread(r1,"child2");
		Thread thread3 = new Thread(r1,"child3");
		
		thread1.start();
		thread1.join();
		
		thread2.start();
		thread2.join();
		
		thread3.start();
		thread3.join();
		
		
		
	}
}



























































