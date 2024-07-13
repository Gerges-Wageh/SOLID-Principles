package LiskovSubstitutionPrinciple.AccountsApp.LSPDesign;

public class SavingAccount extends RegularAccount{
    public SavingAccount(String name, double balance) {
        super(name, balance);
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Withdrawing " + amount + " ....");
    }

    @Override
    public void deposit(double amount) {
        System.out.println("Depositing " + amount + " ....");
    }
}
