package com.march28.test;

import java.util.function.Predicate;

//interface Drawable
//{
//	void myInterface(int a);
//	default void defalutFunction()
//	{
//	    System.out.println("Naresh I Technologies");
//    }
//
//}
//public class Test4
//{
//public static void main(String[] args) {
//Drawable d = (int a) -> System.out.println(a/5);
//d.myInterface(15);
//}
//}


/*interface Movie 
{
   String meth();
}

public class TestMcq 
{
	public static void main(String[] args) 
	{
		Movie m = () -> {return "Salar"+"Prabhas";};
		System.out.println(m.meth());
	}
}*/



/*public class TestMcq 
  {
	public static void main(String[] args) 
	{
		Predicate notNull = (arg -> (arg == null));
		System.out.println(notNull.test(new String("hello")));
	}
}*/


/*@FunctionalInterface
interface NIT
{
      int cal(int value);
}
public class TestMCQ1
{
	public static void main(String[] args)
	 {
		NIT nit = (int value) -> Integer.parseInt(value+75+"");
		System.out.println(nit.cal(25));
	}
}*/


/*interface NIT
{

   String meth();
}

public class TestMcq
{
	public static void main(String[] args)
	{
		NIT nit = () -> "NareshITechnologies"+"+"+"java";
		String meth = nit.meth();
		System.out.println(meth);
	}
}*/

   


/*
 * 
 * 10/0
 * 10/0.0
 * 
 * 0/0 nan
 * 0.0/0.0
 * 
 */



/*public class FunctionalInterface1
{
	public static void main(String args[])
	{
//		Function<Integer ,Double> div = a ->(double)a/0;
//		System.out.println(div.apply(15));
		
		//System.out.println(10.0/0);
		
		//System.out.println(10/0);
		//System.out.println(10/0.0);
		//System.out.println(0/0);
		//System.out.println(0/0.0);
		//System.out.println(0.0/0.0);
		
		
	}
}*/

/*interface Sample 
{
    int x = 20;
	void m1();
}
class Example 
{
	Sample s;
	public Example(Sample s)
	{
	    super();
	    this.s = s;
	}
}

public class TestMCQ1 
{
	public static void main(String[] args) 
	{
		Sample s = () -> System.out.println(Sample.x);
		Example e = new Example(s);
		e.s = null;
		System.out.println(e.s.x);
	    s.m1();
	    
	}
}
*/


/*@FunctionalInterface
interface NIT
{
    String nit(String courseName);
}
interface Course extends NIT
{
	String courseName();
	String facultyName();
	String duration();
}
public class TestMCQ
{
	public static void main(String[] args)
	{
		final Example e ;
		
		NIT nit = (String course) ->
		{ 
			Example e1 = new Example(null);
			return course; 
			
		};
			nit = null;
			System.out.println(nit.nit("Java"));
	}
}*/



/*@FunctionalInterface
interface Invisible
{
    public void show();
}

class Display implements Invisible
{
	Invisible inv;
	public void show()
	{
	   inv = () -> System.out.println("I am Visible");
    }
}

public class TestMcq 
{
	public static void main(String[] args) 
	{
		new Display().inv.show();
	   Display display = new Display();
	   display.show();
	   display.inv.show();
	}
}
*/

































