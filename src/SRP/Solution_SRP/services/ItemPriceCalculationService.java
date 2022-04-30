package SRP.Solution_SRP.services;

import SRP.Solution_SRP.Item;
import SRP.Solution_SRP.logger.LoggerImpl;

import java.util.List;

public class ItemPriceCalculationService {
    private final double plasticBagPrice = 2;

    public double getItemsPrice(List<Item> items) {
        double itemPrice = items.stream().mapToDouble(Item::getPrice).sum();
        return itemPrice;
    }

    public double getPlasticBagsPrice(int totalItems) {
        double updatedPlasticBagPrice = plasticBagPrice;
        if(totalItems > 2) {
            updatedPlasticBagPrice = plasticBagPrice * 0.5;
            LoggerImpl.printLog("More than 2 items purchased. Reducing plastic bag price.");
        }
        return updatedPlasticBagPrice;
    }

    public double getTotalItemsPrice(List<Item> items, int numberOfPlasticBags) {
        int totalItems = items.size();
        double itemsPrice = getItemsPrice(items);
        double plasticBagsPrice = getPlasticBagsPrice(totalItems);

        double totalPrice = itemsPrice + TaxCalculationService.getTaxAmount(itemsPrice) + numberOfPlasticBags * plasticBagsPrice;
        LoggerImpl.printLog("Total Price of the items -> " + totalPrice);

        return totalPrice;
    }
}
