package LSP.Violation_LSP.model;

public class PermanentEmployee extends Employee {
    public PermanentEmployee(int id, String name) {
        super(id, name);
    }

    @Override
    public double calculateBonus(float salary) {
        return salary * 0.1;
    }

    @Override
    public boolean isEligibleForInsurance() {
        return true;
    }
}
