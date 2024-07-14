package InterfaceSegregationPrinciple.EmployeeEntitlementApp.ISPDesign;

public class DayLabourer extends Employee implements IEntitlement, ITransportationReimbursement {
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
    public double calculateHealthInsurance() {
        return 300;
    }

    @Override
    public double calculateTransportationReimbursement() {
        return 150;
    }
}
