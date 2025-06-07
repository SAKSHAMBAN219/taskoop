class Employee {
    public void work() {
        System.out.println("Employee is working.");
    }

    public double getSalary() {
        return 30000;
    }
}

public class HRManager extends Employee {
    public void work() {
        System.out.println("HR Manager is working on hiring.");
    }

    public static void main(String[] args) {
        HRManager hr = new HRManager();
        hr.work();
        System.out.println("Salary: " + hr.getSalary());
    }
}
