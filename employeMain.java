public class employeMain {
    // Attributes
    private String name;
    private double salary;
    private int hireYear;

    // Constructor
    public employeMain(String name, double salary, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.hireYear = hireYear;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getHireYear() {
        return hireYear;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }

    // Method to calculate years of service
    public int calculateYearsOfService() {
        int currentYear = 2025; // You can update this manually each year
        return currentYear - hireYear;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Hire Year: " + hireYear);
        System.out.println("Years of Service: " + calculateYearsOfService());
        System.out.println("-----------------------------------");
    }

    // Main method to test
    public static void main(String[] args) {
        // Create EmployeeMain objects
        employeMain emp1 = new employeMain("Alice", 55000, 2018);
        employeMain emp2 = new employeMain("Balmond", 65000, 2020);

        // Display employee details
        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();
    }
}
