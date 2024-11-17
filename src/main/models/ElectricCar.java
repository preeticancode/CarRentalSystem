package models;

public final class ElectricCar extends Car {
    private double batteryCapacity;

    public ElectricCar(String model, String licensePlate, double batteryCapacity) {
        super(model, licensePlate);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public double calculateRentalPrice() {
        return batteryCapacity * 0.05; // Hypothetical pricing based on battery capacity
    }
}
