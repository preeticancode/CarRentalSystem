package models;

import java.util.Objects;

public sealed class Car permits ElectricCar, SUV {
    private final String name;
    private final String licensePlate;
    private CarStatus status;

    public Car(String name, String licensePlate) {
        this.name = name;
        this.licensePlate = licensePlate;
        this.status = CarStatus.AVAILABLE;
    }

    public String getName() {
        return name;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public CarStatus getStatus() {
        return status;
    }

    public void setStatus(CarStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return name + " (" + licensePlate + "), Status: " + status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return Objects.equals(licensePlate, car.licensePlate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(licensePlate);
    }
}
