package com.april05.multiTProgram_IMP;

public class Course 
{
	int CourseId;
	String courseName;
	double courseFee;
	public Course(int courseId, String courseName, double courseFee) {
		super();
		CourseId = courseId;
		this.courseName = courseName;
		this.courseFee = courseFee;
	}
	public int getCourseId() {
		return CourseId;
	}
	public void setCourseId(int courseId) {
		CourseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public double getCourseFee() {
		return courseFee;
	}
	public void setCourseFee(double courseFee) {
		this.courseFee = courseFee;
	}
	@Override
	public String toString() {
		return "Course [CourseId=" + CourseId + ", courseName=" + courseName + ", courseFee=" + courseFee + "]";
	}
	
	

}

















































