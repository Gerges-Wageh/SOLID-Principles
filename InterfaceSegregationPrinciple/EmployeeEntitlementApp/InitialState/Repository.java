package InterfaceSegregationPrinciple.EmployeeEntitlementApp.InitialState;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Repository {
    public static List<Employee> loadEmployees(){
        return new ArrayList<>(Arrays.asList(
                new Staff(
                        "2017-FI-1343",
                        "Cochran Cole",
                        1000
                ),
                new  Consultant(
                    "2018-FI-1755",
                        "Jaclyn Wolfe",
                        1000
                ),
                new DayLabourer(
                        "2016-IT-1441",
                        "James Tid",
                        1000
                )
        ));
    }
}
