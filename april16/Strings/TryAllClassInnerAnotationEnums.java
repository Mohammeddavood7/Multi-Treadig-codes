package com.april16.Strings;

//class Outer2
//{
//	enum e{}
//	interface i {}
//	@interface ai{}
//	class c{}
//}


class Outer2
{
	private static int x = 44;
	
	class Inner2
	{
		public static void showing()
		{
			System.out.println("value of x: "+x);
		}
		
	}
}



public class TryAllClassInnerAnotationEnums
{
	public static void main(String[] args)
	{
		Outer2.Inner2.showing();
	}

}

























































