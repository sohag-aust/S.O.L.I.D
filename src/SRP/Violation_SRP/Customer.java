package SRP.Violation_SRP;

import java.util.List;

public class Customer {
    private String name;
    private int age;
    private List<Item> items;
    private int numberOfPlasticBags;
    private double plasticBagPrice = 2;

    public Customer(String name, int age, List<Item> items, int numberOfPlasticBags) {
        this.name = name;
        this.age = age;
        this.items = items;
        this.numberOfPlasticBags = numberOfPlasticBags;
    }

    public double calculatePrice(double tax) {
        int totalItems = items.size();
        double itemPrice = items.stream().mapToDouble(Item::getPrice).sum();

        if(totalItems > 2) {
            plasticBagPrice = plasticBagPrice * 0.5;
            logInfo("More than 2 items purchased. Reducing plastic bag price.");
        }

        if(itemPrice <= 100) {
            logInfo("Item price is more than 100. 80 Percent of the actual tax.");
            tax = tax * 0.8;
        } else if(itemPrice >= 100 && itemPrice <= 150) {
            logInfo("Item price is more than 100 but less than 150. 90 Percent of the actual tax.");
            tax = tax * 0.9;
        }

        double totalPrice = itemPrice + tax + this.numberOfPlasticBags * plasticBagPrice;
        logInfo("Total Price of the items: " + totalPrice);

        return totalPrice;
    }

    public void logInfo(String message) {
        FileLogger fileLogger = new FileLogger();
        ConsoleLogger consoleLogger = new ConsoleLogger();

        fileLogger.logInFile(message);
        consoleLogger.logInConsole(message);
    }

    public class FileLogger {
        public void logInFile(String message) {
            System.out.println("File Log: " + message);
        }
    }

    public class ConsoleLogger {
        public void logInConsole(String message) {
            System.out.println("Console Log: " + message);
        }
    }
}
