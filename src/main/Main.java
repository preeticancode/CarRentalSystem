package main;

import services.RentalManager;
import models.*;
import records.Customer;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RentalManager rentalManager = new RentalManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nCar Rental System");
            System.out.println("1. Add a Car");
            System.out.println("2. View Available Cars");
            System.out.println("3. Add a Customer");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int option = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (option) {
                case 1 -> {
                    System.out.print("Enter car type (SUV/Electric): ");
                    String type = scanner.nextLine();
                    if ("SUV".equalsIgnoreCase(type)) {
                        rentalManager.addCar(new SUV("Toyota Highlander", "SUV5678", true));
                    } else if ("Electric".equalsIgnoreCase(type)) {
                        rentalManager.addCar(new ElectricCar("Tesla Model 3", "EV1234", 75.0));
                    }
                    System.out.println("Car added successfully.");
                }
                case 2 -> {
                    List<Car> availableCars = rentalManager.getAvailableCars();
                    if (availableCars.isEmpty()) {
                        System.out.println("No available cars.");
                    } else {
                        availableCars.forEach(System.out::println);
                    }
                }
                case 3 -> {
                    System.out.print("Enter customer name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter customer age: ");
                    int age = scanner.nextInt();
                    Customer customer = new Customer(name, age);
                    System.out.println("Added Customer: " + customer);
                }
                case 4 -> {
                    System.out.println("Exiting... Goodbye!");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid option. Try again.");
            }
        }
    }
}
