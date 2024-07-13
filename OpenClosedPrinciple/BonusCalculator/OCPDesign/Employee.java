package OpenClosedPrinciple.BonusCalculator.OCPDesign;

public abstract class Employee {
    private String ID;
    private String name;
    private double basicSalary;

    public Employee(String ID, String name, double basicSalary) {
        this.ID = ID;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public abstract double calcOverTimeBonus(int hours);
}
