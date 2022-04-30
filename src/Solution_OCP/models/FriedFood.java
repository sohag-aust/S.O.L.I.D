package Solution_OCP.models;

public class FriedFood extends FoodItem {
    public FriedFood(String name) {
        super(name);
    }

    @Override
    public void prepareFood() {
        System.out.println("--> Frying : " + this.getName());
    }
}
