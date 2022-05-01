package LSP.Violation_LSP.model;

public class TemporaryEmployee extends Employee {
    public TemporaryEmployee(int id, String name) {
        super(id, name);
    }

    @Override
    public double calculateBonus(float salary) {
        return salary * 0.05;
    }

    @Override
    public boolean isEligibleForInsurance() {
        return false;
    }
}
