package LiskovSubstitutionPrinciple.AccountsApp.LSPDesign;



public class Main {
    public static void main(String[] args) {

        RegularAccount acc1 = new CheckingAccount("John", 100000.0);
        RegularAccount acc2 = new SavingAccount("Tomas", 500000);
        Account acc3 = new FixedDepositAccount("Lora", 150000);

        acc1.withdraw(1000);
        acc2.withdraw(1000);
        acc3.deposit(1000);
    }
}

// Now no class violates the LSP, each class and all its subclasses object are interchangeable
