package main;

import models.*;
import services.RentalManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RentalManager rentalManager = new RentalManager();
        rentalManager.welcomeMessage();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nCar Rental System");
            System.out.println("1. Add a Car");
            System.out.println("2. View Available Cars");
            System.out.println("3. Show Electric Cars");
            System.out.println("4. Show SUVs with 4WD");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter car type (ELECTRIC/SUV): ");
                    String type = scanner.nextLine().toUpperCase();
                    System.out.print("Enter model: ");
                    String model = scanner.nextLine();
                    System.out.print("Enter registration: ");
                    String registration = scanner.nextLine();
                    System.out.print("Enter rental rate: ");
                    double rate = scanner.nextDouble();

                    if (type.equals("ELECTRIC")) {
                        rentalManager.addCar(new ElectricCar(model, registration, rate));
                    } else if (type.equals("SUV")) {
                        System.out.print("Has 4WD (true/false): ");
                        boolean has4WD = scanner.nextBoolean();
                        rentalManager.addCar(new SUV(model, registration, rate, has4WD));
                    } else {
                        System.out.println("Invalid car type!");
                    }
                }
                case 2 -> rentalManager.showAvailableCars();
                case 3 -> rentalManager.showElectricCars();
                case 4 -> rentalManager.showSUVs();
                case 5 -> {
                    System.out.println("Exiting... Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid option. Try again.");
            }
        }
    }
}
