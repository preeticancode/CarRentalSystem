package models;

public class ElectricCar extends Car {
    private double batteryCapacity;

    public ElectricCar(String model, String registrationNumber, double batteryCapacity) {
        super(model, registrationNumber);
        this.batteryCapacity = batteryCapacity;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + ", Battery Capacity: " + batteryCapacity + " kWh";
    }
}
