package LSP.Violation_LSP.model;

public class ContractEmployee extends Employee {
    public ContractEmployee(int id, String name) {
        super(id, name);
    }

    @Override
    public double calculateBonus(float salary) {
        throw new UnsupportedOperationException("Not Implemented");
    }

    @Override
    public boolean isEligibleForInsurance() {
        return false;
    }
}
