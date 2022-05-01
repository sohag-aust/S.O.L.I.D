package Solution_OCP.models;

import Solution_OCP.interfaces.FoodPreparer;

public abstract class FoodItem implements FoodPreparer{
    private String name;

    public FoodItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
