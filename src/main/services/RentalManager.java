package services;

import models.Car;

import java.util.ArrayList;
import java.util.List;

public class RentalManager {
    private final List<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public List<Car> getAvailableCars() {
        return new ArrayList<>(cars); // Defensive copying
    }
}
