package OpenClosedPrinciple.BonusCalculator.InitialState;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("123", "John", 15000.0, EmpType.RegularEmp);
        System.out.printf("%.2f\n", emp1.calcOverTimeBonus(5));

        Employee emp2 = new Employee("1512", "Smith", 50000.0, EmpType.Manager);
        System.out.printf("%.2f\n",emp2.calcOverTimeBonus(5));


    }
}

// Every thing works good
// Now imagine we want to add new type of Employee say "TeamLeader" what is the cost of that in terms of modification?
// First we modify the EmpType enum to add new type
// modify the Employee::calcOverTimeBonus() to handle this type
// This violates the OCP let's see how we can tune our design to make it extensible
