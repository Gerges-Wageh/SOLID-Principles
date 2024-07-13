package OpenClosedPrinciple.BonusCalculator.OCPDesign;

public class TeamLeader extends Employee{
    public TeamLeader(String ID, String name, double basicSalary) {
        super(ID, name, basicSalary);
    }

    @Override
    public double calcOverTimeBonus(int hours) {
        return ((this.getBasicSalary()/30)/8) * hours * 1.6;
    }
}
