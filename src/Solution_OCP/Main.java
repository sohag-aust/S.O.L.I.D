package Solution_OCP;

import Solution_OCP.models.BakedFood;
import Solution_OCP.models.FoodItem;
import Solution_OCP.models.FriedFood;
import Solution_OCP.models.GrilledFood;
import Solution_OCP.services.KitchenService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FoodItem> foodItems = List.of(
                new GrilledFood("Steak"),
                new FriedFood("Chicken"),
                new BakedFood("Pasta")
        );

        KitchenService kitchenService = new KitchenService();
        System.out.println("Preparing items: ");
        kitchenService.prepareItems(foodItems);
    }
}
