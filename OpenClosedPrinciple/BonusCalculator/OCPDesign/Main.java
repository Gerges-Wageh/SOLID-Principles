package OpenClosedPrinciple.BonusCalculator.OCPDesign;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new RegularEmp("123", "John", 15000.0);
        System.out.printf("%.2f\n", emp1.calcOverTimeBonus(5));

        Employee emp2 = new Manager("1512", "Smith", 50000.0);
        System.out.printf("%.2f\n", emp2.calcOverTimeBonus(5));


        // Testing after extending the code for adding new type of employee
        Employee emp3 = new TeamLeader("147", "Thomas", 35000.0);
        System.out.printf("%.2f\n", emp3.calcOverTimeBonus(5));
    }
}

// We got the same result, but now our code is extensible
// Let's think about adding new type of employee say "TeamLeader", what is the cost of that?
// There is nothing to modify at all!
// You only create a new class called TeamLeader >>extends<< Employee and implements the calcOverTimeBonus() and we're done!

