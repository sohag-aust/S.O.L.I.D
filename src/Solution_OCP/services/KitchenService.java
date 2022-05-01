package Solution_OCP.services;

import Solution_OCP.models.FoodItem;

import java.util.List;

public class KitchenService {
    public void prepareItems(List<FoodItem> foodItems) {
        for(final FoodItem foodItem : foodItems) {
            foodItem.prepareFood();
        }
    }
}
