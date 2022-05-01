package LSP.Violation_LSP;

import LSP.Violation_LSP.model.ContractEmployee;
import LSP.Violation_LSP.model.Employee;
import LSP.Violation_LSP.model.PermanentEmployee;
import LSP.Violation_LSP.model.TemporaryEmployee;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    // Declaring ANSI_RESET so that we can reset the color
    public static final String ANSI_RESET = "\u001B[0m";

    // Custom declaration
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new PermanentEmployee(1, "Sabbir"),
                new TemporaryEmployee(2, "Sazzad"),
                new ContractEmployee(3, "Shohag")
        );

        for(final Employee employee : employees) {
            LOGGER.log(Level.INFO, ANSI_BLUE.concat(employee.toString().concat(" isEligibleForInsurance: " + employee.isEligibleForInsurance())));
        }

        for(final Employee employee : employees) {
            try {
                LOGGER.log(Level.INFO, ANSI_GREEN.concat(employee.toString().concat(" Bonus: " + employee.calculateBonus(1000))));
            } catch (UnsupportedOperationException unsupportedOperationException) {
                LOGGER.log(Level.SEVERE, ANSI_RED.concat("This employee is not eligible for Bonus"));
            }
        }
    }
}
