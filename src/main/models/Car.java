package models;

public abstract sealed class Car permits SUV, ElectricCar {
    private final String model;
    private final String registration;
    private final double rentalRate;

    public Car(String model, String registration, double rentalRate) {
        this.model = model;
        this.registration = registration;
        this.rentalRate = rentalRate;
    }

    public String getModel() {
        return model;
    }

    public String getRegistration() {
        return registration;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", registration='" + registration + '\'' +
                ", rentalRate=" + rentalRate +
                '}';
    }
}
