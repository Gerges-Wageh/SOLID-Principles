package OpenClosedPrinciple.BonusCalculator.OCPDesign;

public class Manager extends Employee{
    public Manager(String ID, String name, double basicSalary) {
        super(ID, name, basicSalary);
    }

    @Override
    public double calcOverTimeBonus(int hours) {
        return ((this.getBasicSalary()/30)/8) * hours * 2;
    }
}
