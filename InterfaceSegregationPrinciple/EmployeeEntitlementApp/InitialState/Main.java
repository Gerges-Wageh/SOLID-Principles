package InterfaceSegregationPrinciple.EmployeeEntitlementApp.InitialState;

import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Employee> employees = Repository.loadEmployees();

        for(Employee emp : employees){
            System.out.println(emp.salarySlip());
        }
        
    }
}

// Everything works as expected, but clients are forced to implement methods that they don't use
// As we violate the ISP in our naive design
// lets see how can we make it better...
