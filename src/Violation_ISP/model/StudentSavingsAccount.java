package Violation_ISP.model;

public class StudentSavingsAccount extends BaseAccount implements SavingsAccount {
    private String institutionName;

    public StudentSavingsAccount(int accountId, String accountName, double balance, String institutionName) {
        super(accountId, accountName, balance);
        this.institutionName = institutionName;
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
        throw new UnsupportedOperationException("International amount transfer is not applicable");
    }
}
