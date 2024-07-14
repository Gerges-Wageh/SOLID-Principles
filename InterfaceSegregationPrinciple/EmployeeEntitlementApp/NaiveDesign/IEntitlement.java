package InterfaceSegregationPrinciple.EmployeeEntitlementApp.InitialState;


// Any client implements this interface will be forced to implement all of this method although
// some clients don't need all of them.
// This method is called "Fat Method"

public interface IEntitlement {
    double calculatePension();
    double calculateHealthInsurance();
    double rentalSubsidy();
    double calculateBonuses();
    double calculateTransportationReimbursement();

}
