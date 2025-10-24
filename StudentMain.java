import java.util.ArrayList;

public class StudentMain {
  
    private String name;
    private String grade;
    private ArrayList<String> courses;

    
    public StudentMain(String name, String grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    
    public void addCourse(String course) {
        courses.add(course);
        System.out.println(course + " has been added for " + name + ".");
    }

    
    public void removeCourse(String course) {
        if (courses.remove(course)) {
            System.out.println(course + " has been removed from " + name + "'s courses.");
        } else {
            System.out.println(course + " not found in " + name + "'s courses.");
        }
    }

   
    public void displayStudentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Courses: " + (courses.isEmpty() ? "No courses enrolled." : courses));
        System.out.println("-----------------------------------");
    }

   
    public static void main(String[] args) {
        // Create StudentMain object
        StudentMain student1 = new StudentMain("Miya", "Grade 11");

        student1.addCourse("Mathematics");
        student1.addCourse("Science");
        student1.addCourse("English");

       
        student1.displayStudentDetails();

        student1.removeCourse("Science");

      
        student1.displayStudentDetails();
    }
}
