package LiskovSubstitutionPrinciple.AccountsApp.LSPDesign;

public abstract class RegularAccount extends Account{

    public RegularAccount(String name, double balance) {
        super(name, balance);
    }

    public abstract void withdraw(double amount);
}
