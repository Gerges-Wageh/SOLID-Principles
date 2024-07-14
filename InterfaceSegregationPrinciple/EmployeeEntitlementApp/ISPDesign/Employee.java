package InterfaceSegregationPrinciple.EmployeeEntitlementApp.ISPDesign;

public abstract class Employee {
    private String employeeNo;
    private String name;
    private double salary;

    public Employee(String employeeNo, String name, double salary) {
        this.employeeNo = employeeNo;
        this.name = name;
        this.salary = salary;
    }

    public String getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    protected abstract double calculateNetSalary();
    public abstract String salarySlip();
}
