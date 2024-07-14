package LiskovSubstitutionPrinciple.AccountsApp.InitialState;

public class SavingAccount extends Account{
    public SavingAccount(String name, double balance) {
        super(name, balance);
    }

    @Override
    public void deposit(double amount) {
        System.out.println("Depositing " + amount + " ....");
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Withdrawing " + amount + " ....");
    }
}
