package com.april13.INNERclass;

public class OuterClass
{
   private int x = 100;
	
	class InnerClass
	{
		public void show()
		{
			System.out.println(x);
		}
	}
	
	public static void main(String[] args)
	{
		OuterClass oc = new OuterClass();
		InnerClass ic = oc.new InnerClass();
		ic.show();
		
		
	}
	
}
