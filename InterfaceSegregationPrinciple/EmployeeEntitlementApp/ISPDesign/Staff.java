package InterfaceSegregationPrinciple.EmployeeEntitlementApp.ISPDesign;

public class Staff extends Employee implements IEntitlement,
        IPensionEntitlement, IRentalSubsidyEntitlement, IBonusEntitlement {

    public Staff(String employeeNo, String name, double salary) {
        super(employeeNo, name, salary);
    }

    @Override
    protected double calculateNetSalary() {
        return getSalary()
                +calculateBonuses()
                +calculateHealthInsurance()
                +rentalSubsidy()
                -calculatePension();
    }

    @Override
    public String salarySlip() {
        return String.format(

                         "\n --- Staff ---" +
                        "\n No: %s"+
                        "\n Name: %s" +
                        "\n Basic Salary: %.2f" +
                        "\n Bonuses: %.2f"+
                        "\n Health Insurance: %.2f" +
                        "\n Rental Subsidy: %.2f" +
                        "\n Pension: %.2f" +
                        "\n ----------------------------------------" +
                        "\n Net Salary: %.2f"
                ,getEmployeeNo(),getName(), getSalary(),calculateBonuses(),
                calculateHealthInsurance(),
                rentalSubsidy(), calculatePension(), calculateNetSalary());
    }

    @Override
    public double calculatePension() {
        return getSalary() * 0.025;
    }

    @Override
    public double calculateHealthInsurance() {
        return 300;
    }

    @Override
    public double rentalSubsidy() {
        return 150;
    }

    @Override
    public double calculateBonuses() {
        return getSalary() * 0.05;
    }

}
