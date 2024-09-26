package com.march30.multithreadinglabtask;

class RailwaySet 
{
  int totalSetAvailable = 1;
 
 int bookingSet;
 

	public RailwaySet(int bookingSet) {
		super();
		this.bookingSet = bookingSet;
	}

	public int getBookingSet()
	{
		
		return bookingSet;
	}

	public int getTotalSetAvailable() {
		
		return totalSetAvailable;
	}

}

public class BookingRailwayTickets
{
	public static void main(String[] args) throws InterruptedException
	{
		RailwaySet rs = new RailwaySet(1);
		
		Runnable run = () ->
	    {
	    	String name = null;
	    	if(rs.getBookingSet() <= rs.getTotalSetAvailable())
	    	{
	    		if(rs.getTotalSetAvailable() > 0)
	    		{
	               
		    		name = Thread.currentThread().getName();
		    		System.out.println("1 set is booked by : "+name);
		    		
		    		rs.totalSetAvailable -= rs.bookingSet;
	    		}
	    	}
	    	else
	    	{
	    		System.out.println("already is seat is booked "+name);
	    		System.err.println("booked");
	    	}
			
	    };
	    
	    Thread th1 = new Thread(run,"scoot");
	    
	    Thread th2 = new Thread(run,"smith");
	    th1.start();
	    th1.join();
	    th2.start();
	   
		
		
	}
}
