package models;

public abstract class Car {
    private String model;
    private String registrationNumber;

    public Car(String model, String registrationNumber) {
        this.model = model;
        this.registrationNumber = registrationNumber;
    }

    public String getModel() {
        return model;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public String toString() {
        return "Car model: " + model + ", Registration Number: " + registrationNumber;
    }
}
