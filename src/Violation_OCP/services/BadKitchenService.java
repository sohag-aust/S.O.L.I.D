package Violation_OCP.services;

import Violation_OCP.models.BakedFood;
import Violation_OCP.models.FoodItem;
import Violation_OCP.models.FriedFood;
import Violation_OCP.models.GrilledFood;

import java.util.List;

public class BadKitchenService {
    public void prepareItems(List<FoodItem> foodItems) {
        for(final FoodItem foodItem : foodItems) {
            if(foodItem instanceof GrilledFood) {
                System.out.println("--> Grilling: " + foodItem.getName());
            }

            if(foodItem instanceof FriedFood) {
                System.out.println("--> Frying: " + foodItem.getName());
            }

            // here, I have to modify my class in order to fit my new logic
            // we should not change our business logic for adding a new meal
            if(foodItem instanceof BakedFood) {
                System.out.println("--> Baking: " + foodItem.getName());
            }
        }
    }
}
