package Violation_ISP.model;

public class RemittanceSavingsAccount extends BaseAccount implements SavingsAccount {
    private String primarySourceCountry;

    public RemittanceSavingsAccount(int accountId, String accountName, double balance, String primarySourceCountry) {
        super(accountId, accountName, balance);
        this.primarySourceCountry = primarySourceCountry;
    }

    @Override
    public double getAccountBalance() {
        return this.balance;
    }

    @Override
    public void creditLocalAmount(double amountInBDT) {
        this.balance += amountInBDT;
    }

    @Override
    public void creditInternationalAmount(double amountInUSD) {
        double amountInBDT = amountInUSD * 86;
        double incentiveAmount = amountInBDT * 0.02;
        this.balance += amountInBDT + incentiveAmount;
    }
}
