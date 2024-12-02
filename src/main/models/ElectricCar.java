package models;

public final class ElectricCar extends Car {
    private final double batteryCapacity;

    public ElectricCar(String model, String licensePlate, double batteryCapacity) {
        super(model, licensePlate);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + ", Battery Capacity: " + batteryCapacity + " kWh";
    }
}
