package main.models;

public class ElectricCar {
    
}
package models;

public final class ElectricCar extends Car {
    private double batteryCapacity;

    public ElectricCar(String model, String registrationNumber, double batteryCapacity) {
        super(model, registrationNumber);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public double calculateRentalPrice(int days) {
        return 50.0 * days; // Flat rate for electric cars
    }
}
