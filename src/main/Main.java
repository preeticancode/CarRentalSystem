package main;
import models.*;
import services.RentalManager;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        RentalManager rentalManager = new RentalManager();

        // Add cars to inventory
        Car electricCar = new ElectricCar("Tesla Model 3", "EV1234", 75.0);
        Car suv = new SUV("Toyota Highlander", "SUV5678", true);
        rentalManager.addCar(electricCar);
        rentalManager.addCar(suv);

        // List available cars
        List<Car> availableCars = rentalManager.getAvailableCars();
        System.out.println("Available Cars:");
        availableCars.forEach(car -> System.out.println(car.getModel()));

        // Book a car
        if (rentalManager.bookCar(electricCar)) {
            System.out.println("Successfully booked: " + electricCar.getModel());
        } else {
            System.out.println("Booking failed for: " + electricCar.getModel());
        }

        // Calculate rental price
        int days = 3;
        double price = electricCar.calculateRentalPrice(days);
        System.out.println("Price for " + days + " days: $" + price);
    }
}
