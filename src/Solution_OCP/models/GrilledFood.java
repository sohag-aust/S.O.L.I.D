package Solution_OCP.models;

public class GrilledFood extends FoodItem {
    public GrilledFood(String name) {
        super(name);
    }

    @Override
    public void prepareFood() {
        System.out.println("--> Grilling : " + this.getName());
    }
}
