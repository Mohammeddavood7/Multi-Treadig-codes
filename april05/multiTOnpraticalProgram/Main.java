package com.april05.multiTOnpraticalProgram;
class Course {
    private int courseId;
    private String courseName;
    private double courseFee;

    public Course(int courseId, String courseName, double courseFee) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseFee = courseFee;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public double getCourseFee() {
        return courseFee;
    }

    @Override
    public String toString() {
        return courseName + " - Fee: Rs." + courseFee;
    }
}

class Offer {
    private String offerText;

    public Offer(String offerText) {
        this.offerText = offerText;
    }

    public String getOfferText() {
        return offerText;
    }
}

class EducationInstitute {
    private Course[] courses;
    private Offer[] offers;

    public EducationInstitute() {
        // Initialize courses with sample data
        courses = new Course[]{
                new Course(1, "Mathematics", 1000.0),
                new Course(2, "Science", 1200.0),
                new Course(3, "English", 900.0)
        };

        // Initialize offers with sample data
        offers = new Offer[]{
                new Offer("Special discount: Get 20% off on all courses!"),
                new Offer("Limited time offer: Enroll in any two courses and get one course free!")
        };
    }

    public Course[] getCourses() {
        return courses;
    }

    public Offer[] getOffers() {
        return offers;
    }

    public void enrollStudentInCourse(int courseId, String studentName) {
        for (Course course : courses) {
            if (course.getCourseId() == courseId) {
                System.out.println(studentName + " has enrolled in the course: " + course.getCourseName());
                break;
            }
        }
    }
}

class Student extends Thread {
    private String name;
    private EducationInstitute institute;

    public Student(String name, EducationInstitute institute) {
        this.name = name;
        this.institute = institute;
    }

    public void viewCoursesAndFees() 
    {
        Course[] courses = institute.getCourses();
        System.out.println("Available Courses:");
        for (Course course : courses) 
        {
            System.out.println(course);
        }
    }

    public void viewOffers() 
    {
        Offer[] offers = institute.getOffers();
        System.out.println("Ongoing Offers:");
        for (Offer offer : offers)
        {
            System.out.println(offer.getOfferText());
        }
    }

    public void enrollInCourse(int courseId)
    {
        institute.enrollStudentInCourse(courseId, name);
    }

    @Override
    public void run() {
        synchronized (institute) {
            System.out.println("\n" + name + " is viewing available courses and offers:");
            viewCoursesAndFees();
            viewOffers();
            // For simplicity, let's enroll the student in the first course available
            enrollInCourse(1); // Enroll in Mathematics
        }
    }
}

public class Main {
    public static void main(String[] args) {
        EducationInstitute institute = new EducationInstitute();
        Student virat = new Student("Virat", institute);
        Student dhoni = new Student("Dhoni", institute);

        virat.start();
        dhoni.start();
    }
}
