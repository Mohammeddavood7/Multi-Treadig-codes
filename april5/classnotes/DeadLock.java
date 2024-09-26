package com.april5.classnotes;

public class DeadLock 
{
    public static void main(String[] args)
    {
    	String resource1 = "Hyderabad";
    	String resource2 = "Kerala";
    	Thread thread1 = new Thread()
        {
    		public void run()
    		{
    			
    			synchronized(resource1)
    			{
    				
    				try {
    					System.out.println("Thread 1 : resource1 is invoked - 1");
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
    				
    				
    				
    				synchronized(resource2)
        			{
    					try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
        				System.out.println("Thread 2 : resource2 is invoked - 2");
        				
        			}
    			}

    			
    		    
    		}
    		
    	};
    	
    	
    	
    	Thread thread2 = new Thread()
        {
    		public void run()
    		{
    			
    			synchronized(resource2)
    			{
    				try {
    					System.out.println("Thread 2 : resource1 is invoked - 3");
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
    				
    				
    				synchronized(resource1)
        			{
    					try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
        				System.out.println("Thread 1 : resource2 is invoked - 4");
        				
        			}
    			}
    			
    			
    			
    		    
    		}
    		
    	};
    	
    	thread1.start();
    	thread2.start();
		
	}

}












































