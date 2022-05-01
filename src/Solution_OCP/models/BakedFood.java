package Solution_OCP.models;

public class BakedFood extends FoodItem {
    public BakedFood(String name) {
        super(name);
    }

    @Override
    public void prepareFood() {
        System.out.println("--> Baking : " + this.getName());
    }
}
