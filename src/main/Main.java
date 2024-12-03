package main;

import services.RentalManager;
import models.Car;
import models.ElectricCar;
import models.SUV;

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
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter car type (1: ElectricCar, 2: SUV): ");
                    int carType = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    System.out.print("Enter car name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter car license plate: ");
                    String licensePlate = scanner.nextLine();

                    if (carType == 1) {
                        System.out.print("Enter battery capacity (in kWh): ");
                        double batteryCapacity = scanner.nextDouble();
                        scanner.nextLine(); // Consume newline
                        rentalManager.addCar(new ElectricCar(name, licensePlate, batteryCapacity));
                    } else if (carType == 2) {
                        System.out.print("Is it a four-wheel drive (true/false)? ");
                        boolean fourWheelDrive = scanner.nextBoolean();
                        scanner.nextLine(); // Consume newline
                        rentalManager.addCar(new SUV(name, licensePlate, fourWheelDrive));
                    } else {
                        System.out.println("Invalid car type!");
                    }
                    break;

                case 2:
                    List<Car> availableCars = rentalManager.getAvailableCars();
                    if (availableCars.isEmpty()) {
                        System.out.println("No available cars.");
                    } else {
                        System.out.println("Available Cars:");
                        availableCars.forEach(System.out::println);
                    }
                    break;

                case 3:
                    System.out.println("Exiting... Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}