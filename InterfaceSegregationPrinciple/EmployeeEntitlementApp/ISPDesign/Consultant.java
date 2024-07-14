package InterfaceSegregationPrinciple.EmployeeEntitlementApp.ISPDesign;

public class Consultant extends Employee implements IEntitlement, IBonusEntitlement,
                                                        ITransportationReimbursement {
    public Consultant(String employeeNo, String name, double salary) {
        super(employeeNo, name, salary);
    }

    @Override
    protected double calculateNetSalary() {
        return getSalary()
                + calculateBonuses()
                + calculateHealthInsurance()
                + calculateTransportationReimbursement();
    }

    @Override
    public String salarySlip() {
        return  String.format(
                        "\n --- Consultant ---" +
                        "\n No: %s"+
                        "\n Name: %s" +
                        "\n Basic Salary: %.2f" +
                        "\n Bonuses: %.2f"+
                        "\n Health Insurance: %.2f" +
                        "\n Transportation Reimbursement: %.2f" +
                        "\n ----------------------------------------" +
                        "\n Net Salary: %.2f"

                ,getEmployeeNo(),getName(), getSalary(), calculateBonuses(),
                calculateHealthInsurance(),
                calculateTransportationReimbursement(),calculateNetSalary());
    }

    @Override
    public double calculateHealthInsurance() {
        return 300;
    }

    @Override
    public double calculateBonuses() {
        return getSalary() * 0.05;
    }

    @Override
    public double calculateTransportationReimbursement() {
        return 150;
    }
}
