package models;

public abstract sealed class Car permits ElectricCar, SUV {
    private String model;
    private String licensePlate;

    public Car(String model, String licensePlate) {
        this.model = model;
        this.licensePlate = licensePlate;
    }

    public String getModel() {
        return model;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public abstract double calculateRentalPrice();

    @Override
    public String toString() {
        return "Car[model=" + model + ", licensePlate=" + licensePlate + "]";
    }
}
