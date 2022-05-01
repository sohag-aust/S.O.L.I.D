package LSP.Solution_LSP;

import LSP.Solution_LSP.model.*;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    // Declaring ANSI_RESET so that we can reset the color
    public static final String ANSI_RESET = "\u001B[0m";

    // Custom declaration
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";

    public static void main(String[] args) {
        List<IEmployee> employees = List.of(
                new PermanentEmployee(1, "Sabbir"),
                new TemporaryEmployee(2, "Sazzad"),
                new ContractEmployee(3, "Shohag")
        );

        for(final IEmployee employee : employees) {
            LOGGER.log(Level.INFO, ANSI_BLUE.concat(employee.toString().concat(" isEligibleForInsurance: " + employee.isEligibleForInsurance())));
        }

        // the temporary Employee has no permission to enter over EmployeeBonusEligible List, because he has no implementation for calculate bonus, so need to handle exceptions also
        List<EmployeeBonusEligible> employeeBonusEligibles = List.of(
                new PermanentEmployee(1, "Sabbir"),
                new TemporaryEmployee(2, "Sazzad")
        );

        for(final EmployeeBonusEligible employeeBonusEligible : employeeBonusEligibles) {
            LOGGER.log(Level.INFO, ANSI_GREEN.concat(employeeBonusEligible.toString().concat(" Bonus: " + employeeBonusEligible.calculateBonus(1000))));
        }
    }
}
