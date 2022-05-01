package Violation_ISP.model;

public interface SavingsAccount {
    double getAccountBalance();
    void creditLocalAmount(double amountInBDT);
    void creditInternationalAmount(double amountInUSD);
}
