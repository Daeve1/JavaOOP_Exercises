
class Course {
    protected String courseName;
    protected String instructor;
    protected int credits;

 
    public Course(String courseName, String instructor, int credits) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.credits = credits;
    }

    
    public void displayDetails() {
        System.out.println("\n=== Course Details ===");
        System.out.println("Course Name: " + courseName);
        System.out.println("Instructor: " + instructor);
        System.out.println("Credits: " + credits);
    }
}


class OnlineCourse extends Course {
    private String platform;
    private int duration;
    
    public OnlineCourse(String courseName, String instructor, int credits, String platform, int duration) {
        super(courseName, instructor, credits);
        this.platform = platform;
        this.duration = duration;
    }

   
    public boolean isEligibleForCertificate() {
        return duration >= 4;
    }

    
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Platform: " + platform);
        System.out.println("Duration: " + duration + " weeks");

        if (isEligibleForCertificate()) {
            System.out.println("Certificate: Eligible ✅");
        } else {
            System.out.println("Certificate: Not eligible ❌");
        }
    }
}


public class CourseMain {
    public static void main(String[] args) {
        Course course1 = new Course("Introduction to Programming", "Mr. Brody ", 3);
        course1.displayDetails();

        OnlineCourse onlineCourse1 = new OnlineCourse("IT era", "Ms. Melissa", 4, "Udemy", 6);
        onlineCourse1.displayDetails();

        OnlineCourse onlineCourse2 = new OnlineCourse("DSA", "Mr. Alucard", 2, "Coursera", 2);
        onlineCourse2.displayDetails();
    }
}
