package com.april05.multiTProgram_IMP;

public class EducationInstitute
{
	Course course[] ;
	Offer offer[];
	public EducationInstitute()
	{
		 course = new Course[]{
	                new Course(1, "Mathematics", 1000.0),
	                new Course(2, "Science", 1200.0),
	                new Course(3, "English", 900.0)
	        };
		 
		offer = new Offer[]{
                new Offer("Special discount: Get 20% off on all courses!"),
                new Offer("Limited time offer: Enroll in any two courses and get one course free!")
        };
	}
	public Course[] getCourse() {
		return course;
	}
	public void setCourse(Course[] course) {
		this.course = course;
	}
	public Offer[] getOffer() {
		return offer;
	}
	public void setOffer(Offer[] offer) {
		this.offer = offer;
	}
	
	 public void enrollStudentInCourse(int courseId, String studentName) {
	        for (Course course : course) {
	            if (course.getCourseId() == courseId) {
	                System.out.println(studentName + " has enrolled in the course: " + course.getCourseName());
	                break;
	            }
	        }
	    }
	
}







































