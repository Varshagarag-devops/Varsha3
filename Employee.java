public class Employee extends Person {
    private String empId;
    private double salary;

    public Employee(String name, String empId, double salary) {
        super(name);
        this.empId = empId;
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: ₹" + salary);
    }
}
