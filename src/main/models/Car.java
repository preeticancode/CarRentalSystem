package models;

public abstract class Car {
    private String name;
    private String licensePlate;

    public Car(String name, String licensePlate) {
        this.name = name;
        this.licensePlate = licensePlate;
    }

    public String getName() {
        return name;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    @Override
    public String toString() {
        return "Car: " + name + " (" + licensePlate + ")";
    }
}
