package LSP.Solution_LSP.model;

public class ContractEmployee extends Employee {
    public ContractEmployee(int id, String name) {
        super(id, name);
    }

    @Override
    public boolean isEligibleForInsurance() {
        return false;
    }
}
