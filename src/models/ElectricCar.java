package models;

public final class ElectricCar extends Car {
    private final double batteryCapacity;

    public ElectricCar(String name, String licensePlate, double batteryCapacity) {
        super(name, licensePlate);
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
