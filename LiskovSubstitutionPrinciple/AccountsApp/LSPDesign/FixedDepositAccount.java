package LiskovSubstitutionPrinciple.AccountsApp.LSPDesign;

public class FixedDepositAccount extends Account{
    public FixedDepositAccount(String name, double balance) {
        super(name, balance);
    }

    @Override
    public void deposit(double amount) {
        System.out.println("Depositing " + amount + " ....");
    }
}
