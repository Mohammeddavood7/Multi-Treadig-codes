package com.april06.CloneClass;

public class Student 
{
    int id;
    String name;
    
    public Student(int id, String name)
    {
    	this.id= id;
    	this.name = name;
    }    
    
	@Override
	public String toString() 
	{
		return "Id is :"+id+"\nName is :"+name;
	}

	@Override
	protected void finalize() 
	{
      System.out.println("JVM call this finalize method...");		
	}


	public static void main(String[] args) throws InterruptedException 
	{
      Student s1 = new Student(111,"Ravi");
      System.out.println(s1.hashCode());
      System.out.println(s1);
      
      s1 = null;
      System.gc(); //Explicitly calling Garbage Collector
      Thread.sleep(3000);
      System.out.println(s1);
	}

}