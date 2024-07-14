package InterfaceSegregationPrinciple.EmployeeEntitlementApp.ISPDesign;

import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Employee> employees = Repository.loadEmployees();

        for(Employee emp : employees){
            System.out.println(emp.salarySlip());
        }
        
    }
}

// We've got the same results, but now there is no client forced to implement a method that does not need.
// this design follows the ISP.
// No matter the number of files are, we have a clean, concise design