package Violation_OCP;

import Violation_OCP.models.BakedFood;
import Violation_OCP.models.FoodItem;
import Violation_OCP.models.FriedFood;
import Violation_OCP.models.GrilledFood;
import Violation_OCP.services.BadKitchenService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FoodItem> foodItems = List.of(
                new GrilledFood("Steak"),
                new FriedFood("Chicken"),
                new BakedFood("Pasta")
        );

        BadKitchenService badKitchenService = new BadKitchenService();
        System.out.println("Preparing items: ");
        badKitchenService.prepareItems(foodItems);
    }
}
