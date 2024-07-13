package LiskovSubstitutionPrinciple.AccountsApp.InitialState;

public class FixedDepositAccount extends Account{
    public FixedDepositAccount(String name, double balance) {
        super(name, balance);
    }

    @Override
    public void deposit(double amount) {
        System.out.println("Depositing " + amount + " ....");
    }

    @Override
    public void withdraw(double amount) {
        throw new RuntimeException("This account doesn't support this type of operations!");
    }
}
