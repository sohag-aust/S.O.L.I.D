package SRP.Solution_SRP;

import SRP.Solution_SRP.services.ItemPriceCalculationService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Item cleanCodeBook = new Item("Clean Code", 100);
        Item mask = new Item("Mask", 10);
        Item tShirt = new Item("Polo", 20);

        List<Item> itemsPurchased = List.of(cleanCodeBook, mask, tShirt);
        int plasticBagTaken = 2;

        Customer uncleBob = new Customer("Robert C Martin", 68);
        System.out.println(uncleBob);

        ItemPriceCalculationService itemPriceCalculationService = new ItemPriceCalculationService();
        double totalPriceOfItems = itemPriceCalculationService.getTotalItemsPrice(itemsPurchased, plasticBagTaken);
        System.out.println("Total Prices of items purchased -> " + totalPriceOfItems);
    }
}
