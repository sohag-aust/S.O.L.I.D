package SRP.Solution_SRP.services;

import SRP.Solution_SRP.logger.LoggerImpl;

public class TaxCalculationService {
    private static final double primaryTax = 10;

    public static double getTaxAmount(double itemPrice) {
        double currentTax = primaryTax;
        if(itemPrice <= 100) {
            LoggerImpl.printLog("Item price is more than 100. 80 Percent of the actual tax.");
            currentTax = primaryTax * 0.8;
        } else if(itemPrice >= 100 && itemPrice <= 150) {
            LoggerImpl.printLog("Item price is more than 100 but less than 150. 90 Percent of the actual tax.");
            currentTax = primaryTax * 0.9;
        }
        return currentTax;
    }
}
