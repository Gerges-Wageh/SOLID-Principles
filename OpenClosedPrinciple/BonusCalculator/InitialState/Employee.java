package OpenClosedPrinciple.BonusCalculator.InitialState;

public class Employee {
    private String ID;
    private String name;
    private double basicSalary;
    private EmpType empType;

    public Employee(String ID, String name, double basicSalary, EmpType empType) {
        this.ID = ID;
        this.name = name;
        this.basicSalary = basicSalary;
        this.empType = empType;
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

    public EmpType getEmpType() {
        return empType;
    }

    public void setEmpType(EmpType empType) {
        this.empType = empType;
    }

    public double calcOverTimeBonus(int hours){
        double totalBonus = 0;
        if(this.getEmpType() == EmpType.RegularEmp){
            totalBonus = ((this.getBasicSalary() / 30) / 8 ) * hours;
        } else if (this.getEmpType() == EmpType.Manager) {
            totalBonus = ((this.getBasicSalary() / 30) / 8 ) * hours * 2;
        }

        return totalBonus;
    }
}



enum EmpType{
    RegularEmp,
    Manager
}