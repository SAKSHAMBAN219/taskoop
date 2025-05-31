public class Employee {
    private String name;
    private String jobTitle;
    private double salary;
    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
    public double calculateAnnualSalary() {
        return salary * 12;
    }
    public void updateSalary(double amount) {
        if (salary + amount >= 0) {
            salary += amount;
        }
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Monthly Salary: " + salary);
        System.out.println("Annual Salary: " + calculateAnnualSalary());
    }
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", "Manager", 5000);
        emp.updateSalary(500);
        emp.displayInfo();
    }
}
