
class CounterClass 
{
	private int currentCountValue = 10;
	 
	public synchronized void increment()
	{
		currentCountValue++;
		String name = Thread.currentThread().getName();
		System.out.println("Name of the Thread: "+name+", Current Count Value: "+currentCountValue);
	}

}
class IncrementThread implements Runnable
{
	CounterClass count;
	
	public IncrementThread(CounterClass count)
	{
		this.count = count;
		
	}

	@Override
	public void run()
	{
		for(int i = 1;i <= 5; i++)
		{
		   count.increment();
		}
		
		
	}
	
}

public class BasicCounterProgram
{
	public static void main(String[] args) throws InterruptedException
	{
		CounterClass counterClass = new CounterClass();
		IncrementThread incrementThread = new IncrementThread(counterClass);
		Thread thread1 = new Thread(incrementThread);
		Thread thread2 = new Thread(incrementThread);
		thread1.start();
		thread2.start();
		
		
	

		
	}
}



















































