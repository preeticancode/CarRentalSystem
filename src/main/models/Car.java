package models;

public abstract sealed class Car permits ElectricCar, SUV {
    private String model;
    private String registrationNumber;
    private CarStatus status;

    // Constructor using this()
    public Car(String model, String registrationNumber) {
        this();
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.status = CarStatus.AVAILABLE;
    }

    public Car() {
        this.status = CarStatus.AVAILABLE; // Default status
    }

    // Getter and setter methods
    public String getModel() {
        return model;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public CarStatus getStatus() {
        return status;
    }

    public void setStatus(CarStatus status) {
        this.status = status;
    }

    // Abstract method to be implemented by subclasses
    public abstract double calculateRentalPrice(int days);
}
