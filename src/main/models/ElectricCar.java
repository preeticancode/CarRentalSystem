package models;

public class ElectricCar extends Car {
    private double batteryCapacity;

    public ElectricCar(String name, String licensePlate, double batteryCapacity) {
        super(name, licensePlate);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + ", Battery Capacity: " + batteryCapacity + " kWh";
    }
}
