package com.april5.classnotes;

class SetDeamon1 extends Thread
{
	@Override
	 public void run()
	 {
	     while(true)
	     {
				System.out.println("Deamon Thread running :");

		try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
				
		}
	 }

}
class SetDeamon2 extends Thread
{
	@Override
	public void run()
	{
		for(int i = 1 ; i <= 9; i++)
		{
			System.out.println("User Thread :"+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}
public class SetDeamonDemo
{
	public static void main(String[] args)
	{
		SetDeamon1 sd1 = new SetDeamon1();
		SetDeamon2 sd2 = new SetDeamon2();
		sd1.setDaemon(true);
		sd1.start();
		sd2.start();
		
		

		
		
		
		
		
	}
	
	
	
	
}




































