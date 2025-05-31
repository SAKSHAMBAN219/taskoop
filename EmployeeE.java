public class EmployeeE {
    private String name;
    private int id;
    private double salary;
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public double getSalary() { return salary; }
    public void updateSalary(double amount) {
        if (salary + amount >= 0) salary += amount;
    }
}
