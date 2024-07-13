package LiskovSubstitutionPrinciple.AccountsApp.InitialState;

// Client code
public class Main {
    public static void main(String[] args) {
        Account acc1 = new CheckingAccount("John", 100000.0);
        Account acc2 = new SavingAccount("Tomas", 500000);
        Account acc3 = new FixedDepositAccount("Lora", 150000);

        acc1.withdraw(1000);
        acc2.withdraw(1000);
        acc3.withdraw(1000);
    }
}

// As you see that an object of FixedDepositAccount class couldn't substitute an object of Account class
// this violates the LSP which states that "The object and the sub-objects of a class should be interchangeable
// without breaking the program

// In this design just 2 sub-object imply the principle and the third violates it
// Lets see how we could tune our design so that all classes and subs follows the LSP...