package main;

import models.*;
import services.RentalManager;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        RentalManager rentalManager = new RentalManager();

        Car electricCar = new ElectricCar("Tesla Model 3", "EV1234", 75.0);
        Car suv = new SUV("Toyota Highlander", "SUV5678", true);

        List<Car> availableCars = rentalManager.getAvailableCars();
        availableCars.forEach(System.out::println);
    }
}
