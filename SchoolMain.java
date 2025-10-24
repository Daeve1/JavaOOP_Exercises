public class SchoolMain {
    
    private String[] students;
    private String[] teachers;
    private String[] classes;
    private int studentCount;
    private int teacherCount;
    private int classCount;

   
    public SchoolMain(int studentSize, int teacherSize, int classSize) {
        students = new String[studentSize];
        teachers = new String[teacherSize];
        classes = new String[classSize];
        studentCount = 0;
        teacherCount = 0;
        classCount = 0;
    }

    
    public void addStudent(String name) {
        if (studentCount < students.length) {
            students[studentCount++] = name;
            System.out.println("Student added: " + name);
        } else {
            System.out.println("Student list is full!");
        }
    }

   
    public void removeStudent(String name) {
        boolean found = false;
        for (int i = 0; i < studentCount; i++) {
            if (students[i].equalsIgnoreCase(name)) {
                for (int j = i; j < studentCount - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[--studentCount] = null;
                found = true;
                System.out.println("Student removed: " + name);
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found: " + name);
        }
    }

 
    public void addTeacher(String name) {
        if (teacherCount < teachers.length) {
            teachers[teacherCount++] = name;
            System.out.println("Teacher added: " + name);
        } else {
            System.out.println("Teacher list is full!");
        }
    }

   
    public void removeTeacher(String name) {
        boolean found = false;
        for (int i = 0; i < teacherCount; i++) {
            if (teachers[i].equalsIgnoreCase(name)) {
                for (int j = i; j < teacherCount - 1; j++) {
                    teachers[j] = teachers[j + 1];
                }
                teachers[--teacherCount] = null;
                found = true;
                System.out.println("Teacher removed: " + name);
                break;
            }
        }
        if (!found) {
            System.out.println("Teacher not found: " + name);
        }
    }

 
    public void createClass(String className) {
        if (classCount < classes.length) {
            classes[classCount++] = className;
            System.out.println("Class created: " + className);
        } else {
            System.out.println("Class list is full!");
        }
    }

 
    public void displayInfo() {
        System.out.println("\n--- School Information ---");
        System.out.println("Students:");
        for (int i = 0; i < studentCount; i++) {
            System.out.println("- " + students[i]);
        }

        System.out.println("\nTeachers:");
        for (int i = 0; i < teacherCount; i++) {
            System.out.println("- " + teachers[i]);
        }

        System.out.println("\nClasses:");
        for (int i = 0; i < classCount; i++) {
            System.out.println("- " + classes[i]);
        }
    }

    
    public static void main(String[] args) {
        SchoolMain school = new SchoolMain(5, 3, 3);

        school.addStudent("Moskov");
        school.addStudent("Gloo");
        school.addTeacher("Mr. Natan");
        school.addTeacher("Ms. Ixia");
        school.createClass("Programming 1");
        school.createClass("Networking 1");

        school.displayInfo();

        school.removeStudent("Gloo");
        school.removeTeacher("Ms. Ixia");

        school.displayInfo();
    }
}
