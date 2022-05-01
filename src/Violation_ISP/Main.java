package Violation_ISP;

import Violation_ISP.model.RemittanceSavingsAccount;
import Violation_ISP.model.StudentSavingsAccount;

public class Main {
    public static void main(String[] args) {
        RemittanceSavingsAccount remittanceSavingsAccount = new RemittanceSavingsAccount(
                1,
                "Rahim",
                100,
                "Germany"
        );

        remittanceSavingsAccount.creditLocalAmount(100);
        remittanceSavingsAccount.creditInternationalAmount(10);
        System.out.println("Remittance Account Balance : " + remittanceSavingsAccount.getAccountBalance());

        StudentSavingsAccount studentSavingsAccount = new StudentSavingsAccount(
                1,
                "Karim",
                100,
                "BUET"
        );

        studentSavingsAccount.creditLocalAmount(100);
        studentSavingsAccount.creditInternationalAmount(10);
        System.out.println("Student Account Balance : " + studentSavingsAccount.getAccountBalance());
    }
}
