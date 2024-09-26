package com.april05.multiTProgram_IMP;

import java.util.Arrays;

public class Student extends Thread
{
	String studentName;
    EducationInstitute institute;
	public Student(String studentName, EducationInstitute institute) {
		super();
		this.studentName = studentName;
		this.institute = institute;
	}
    
    public void viewCoursesAndFees()
    {
    	System.out.println(Arrays.toString(institute.getCourse()));
    }
    
    public void viewOffers()
    {
    	System.out.println(Arrays.toString(institute.getOffer()));
    }
	
    public void enrollInCourse(int courseId)
    {
    	for(Course cse : institute.getCourse())
    	{
    		if(cse.CourseId == courseId)
    		{
    			System.out.println(cse.toString());
    		}
    		else if(cse.CourseId == courseId)
    		{
    			System.out.println(cse.toString());
    		}
    		else if(cse.CourseId == courseId)
    		{
    			System.out.println(cse.toString());
    		}
    	}
    }

}






































