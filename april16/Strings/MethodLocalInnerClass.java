package com.april16.Strings;

class Outer4
{
	public void showMethodLocalInnerClass()
	{
	
		class Inner4 
		{
			public void showing()
			{
				System.out.println("Method local inner class invoked");
			}
			
		}
		
		Inner4 in = new Inner4();
		
		in.showing();
	}
}

public class MethodLocalInnerClass
{
	public static void main(String[] args)
	{
		Outer4 or = new Outer4();
		or.showMethodLocalInnerClass();
		
	}
	


}



























