package LSP.Solution_LSP.model;

public class TemporaryEmployee extends Employee implements EmployeeBonusEligible{
    public TemporaryEmployee(int id, String name) {
        super(id, name);
    }

    @Override
    public double calculateBonus(double salary) {
        return salary * 0.05;
    }

    @Override
    public boolean isEligibleForInsurance() {
        return false;
    }
}
