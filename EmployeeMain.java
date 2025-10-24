public class EmployeeMain {
  
    private String name;
    private String jobTitle;
    private double salary;

  
    public EmployeeMain(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    
    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    
    public double calculateAnnualSalary() {
        return salary * 12;
    }

  
    public void increaseSalary(double percentage) {
        if (percentage > 0) {
            salary += salary * (percentage / 100);
            System.out.println("Salary updated by " + percentage + "%.");
        } else {
            System.out.println("Invalid percentage. No update made.");
        }
    }

    
    public void displayEmployee() {
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Monthly Salary: " + salary);
        System.out.println("Annual Salary: " + calculateAnnualSalary());
        System.out.println("------------------------------");
    }

    // Main method to test
    public static void main(String[] args) {
        // Create EmployeeMain objects
        EmployeeMain emp1 = new EmployeeMain("Juan", "Software Engineer", 5000);
        EmployeeMain emp2 = new EmployeeMain("Pedro", "Project Manager", 7000);

      
        System.out.println("Initial Employee Information:");
        emp1.displayEmployee();
        emp2.displayEmployee();

        
        emp1.increaseSalary(15); 
        emp2.increaseSalary(10);  
       

        System.out.println("After Salary Update:");
        emp1.displayEmployee();
        emp2.displayEmployee();
    }
}
