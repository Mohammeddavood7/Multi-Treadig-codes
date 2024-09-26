package com.april16.Strings;

class Outer 
{
	private int x = 19;
	
	class Inner
	{
		public void show()
		{
			System.out.println("value of x: "+x);
		}
	}
	
}

public class InnerClassAccessOuterPrivateVariable
{
	public static void main(String[] args)
	{
//		Outer or = new Outer();
//		Outer.Inner inner = or.new Inner();
//		inner.show();
		
		
		Outer.Inner in = new Outer().new Inner();
		in.show();
	}
	
}
































