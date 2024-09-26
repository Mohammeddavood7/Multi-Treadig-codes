package com.april02.tastonmultithreadin;


class Test4 extends Thread
{
	int x;
	int y;
	
   public Test4(int x ,int y)
   {
	   this.x = x;
	   this.y = y;
	   
   }
	
  @Override
  public void run()
  {
	  for(int i=x; i<=y;i++)
	  {
		  System.out.println(i);
	  }
  }
}



public class concurrentlyTest4
{
	public static void main(String[] args) throws InterruptedException
	{
		Test4 t1 = new Test4(10, 30);
			t1.start();
			t1.join();
			
			Test4 t2 = new Test4(10, 30);
			t2.start();
		
	}

}





























