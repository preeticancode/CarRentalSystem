package services;

import models.*;
import utils.RentalTransaction;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class RentalManager {
    private final List<Car> availableCars = new ArrayList<>();
    private final List<RentalTransaction> transactions = new ArrayList<>();

    public void addCar(Car car) {
        availableCars.add(car);
        System.out.println("Car added successfully!");
    }

    public void addCarInteractive(Scanner scanner) {
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
            addCar(new ElectricCar(name, licensePlate, batteryCapacity));
        } else if (carType == 2) {
            System.out.print("Is it a four-wheel drive (true/false)? ");
            boolean fourWheelDrive = scanner.nextBoolean();
            addCar(new SUV(name, licensePlate, fourWheelDrive));
        } else {
            System.out.println("Invalid car type!");
        }
    }

    public void displayAvailableCars() {
        availableCars.forEach(System.out::println);
    }

    public void rentCarInteractive(Scanner scanner) {
        System.out.print("Enter your name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter customer ID: ");
        String customerId = scanner.nextLine();

        System.out.print("Enter license plate of the car to rent: ");
        String licensePlate = scanner.nextLine();

        Car car = findCarByLicensePlate(licensePlate);
        if (car == null || car.getStatus() != CarStatus.AVAILABLE) {
            System.out.println("Car not available!");
        } else {
            car.setStatus(CarStatus.RENTED);
            transactions.add(new RentalTransaction(car, new Customer(customerName, customerId)));
            System.out.println("Car rented successfully!");
        }
    }

    public void returnCarInteractive(Scanner scanner) {
        System.out.print("Enter license plate of the car to return: ");
        String licensePlate = scanner.nextLine();

        Car car = findCarByLicensePlate(licensePlate);
        if (car == null || car.getStatus() != CarStatus.RENTED) {
            System.out.println("Car not currently rented!");
        } else {
            car.setStatus(CarStatus.AVAILABLE);
            System.out.println("Car returned successfully!");
        }
    }

    private Car findCarByLicensePlate(String licensePlate) {
        return availableCars.stream()
                .filter(car -> car.getLicensePlate().equals(licensePlate))
                .findFirst()
                .orElse(null);
    }
}
