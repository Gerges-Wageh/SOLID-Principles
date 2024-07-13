package LiskovSubstitutionPrinciple.AccountsApp.LSPDesign;

public class CheckingAccount extends RegularAccount{
    public CheckingAccount(String name, double balance) {
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
