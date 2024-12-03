package main;

import java.util.Scanner;
import services.RentalManager;

public class Main {
    public static void main(String[] args) {
        RentalManager rentalManager = new RentalManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nCar Rental System");
            System.out.println("1. Add a Car");
            System.out.println("2. View Available Cars");
            System.out.println("3. Rent a Car");
            System.out.println("4. Return a Car");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> rentalManager.addCarInteractive(scanner);
                case 2 -> rentalManager.displayAvailableCars();
                case 3 -> rentalManager.rentCarInteractive(scanner);
                case 4 -> rentalManager.returnCarInteractive(scanner);
                case 5 -> {
                    System.out.println("Exiting... Goodbye!");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
