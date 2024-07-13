package OpenClosedPrinciple.BonusCalculator.OCPDesign;

public class RegularEmp extends Employee {
    public RegularEmp(String ID, String name, double basicSalary) {
        super(ID, name, basicSalary);
    }

    @Override
    public double calcOverTimeBonus(int hours) {
        return ((this.getBasicSalary() / 30) / 8) * hours;
    }
}
