package InterfaceSegregationPrinciple.EmployeeEntitlementApp.InitialState;

public class DayLabourer extends Employee implements IEntitlement{
    public DayLabourer(String employeeNo, String name, double salary) {
        super(employeeNo, name, salary);
    }

    @Override
    protected double calculateNetSalary() {
        return getSalary() + calculateHealthInsurance() + calculateTransportationReimbursement();
    }

    @Override
    public String salarySlip() {
        return String.format(
                        "\n --- DayLabourer ---" +
                        "\n No: "+
                        "\n Name: %s" +
                        "\n Basic Salary: %.2f" +
                        "\n Health Insurance: %.2f" +
                        "\n Transportation Reimbursement: %.2f" +
                        "\n ----------------------------------------" +
                        "\n Net Salary: %.2f"

                ,getName(), getSalary(),
                calculateHealthInsurance(),
                calculateTransportationReimbursement(),calculateNetSalary());
    }

    @Override
    public double calculatePension() {
        throw new RuntimeException("Day Labourer Pension not supported");
    }

    @Override
    public double calculateHealthInsurance() {
        return 300;
    }

    @Override
    public double rentalSubsidy() {
        throw new RuntimeException("Day Labourer Rental Subsidy not supported");
    }

    @Override
    public double calculateBonuses() {
        throw new RuntimeException("Day Labourer Bonuses not supported");
    }

    @Override
    public double calculateTransportationReimbursement() {
        return 150;
    }
}
