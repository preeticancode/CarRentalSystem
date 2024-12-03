package services;

import models.Car;

public interface RentalService {
    void addCar(Car car);

    default void showTotalCars() {
        System.out.println("Displaying total cars in the system.");
    }

    static void welcomeMessage() {
        System.out.println("Welcome to the Car Rental System!");
    }
}
