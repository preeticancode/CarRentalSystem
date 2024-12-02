package models;

public abstract sealed class Car permits SUV, ElectricCar {
    private final String model;
    private final String licensePlate;

    protected Car(String model, String licensePlate) {
        this.model = model;
        this.licensePlate = licensePlate;
    }

    public String getModel() {
        return model;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    @Override
    public String toString() {
        return "Car [Model: " + model + ", License Plate: " + licensePlate + "]";
    }
}
