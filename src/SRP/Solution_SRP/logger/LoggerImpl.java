package SRP.Solution_SRP.logger;

public class LoggerImpl {
    private static final Logger fileLogger = (message) -> {
        System.out.println("FileLog : " + message);
    };

    private static final Logger consoleLogger = (message) -> {
        System.out.println("ConsoleLog : " + message);
    };

    public static void printLog(String message) {
        fileLogger.log(message);
        consoleLogger.log(message);
    }
}
