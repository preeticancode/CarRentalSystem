package models;

public final class ElectricCar extends Car {
    public ElectricCar(String model, String registration, double rentalRate) {
        super(model, registration, rentalRate);
    }

    @Override
    public String toString() {
        return "ElectricCar: " + super.toString();
    }
}
