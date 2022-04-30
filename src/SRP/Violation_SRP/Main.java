package SRP.Violation_SRP;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Item cleanCodeBook = new Item("Clean Code", 100);
        Item mask = new Item("Mask", 10);
        Item tShirt = new Item("Polo", 20);

        int plasticBagTaken = 2;
        int tax = 10;

        List<Item> itemsPurchased = List.of(cleanCodeBook, mask, tShirt);

        Customer uncleBob = new Customer("Robert C Martin", 68, itemsPurchased, plasticBagTaken);
        double totalPriceOfItems = uncleBob.calculatePrice(tax);
        System.out.println("Total Prices of items purchased: " + totalPriceOfItems);
    }
}
