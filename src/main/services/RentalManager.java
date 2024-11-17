package services;

import models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RentalManager implements RentalOperations {
    private final List<Car> carInventory;

    public RentalManager() {
        this.carInventory = new ArrayList<>();
    }

    public void addCar(Car car) {
        carInventory.add(car);
    }

    @Override
    public List<Car> getAvailableCars() {
        return carInventory.stream()
                .filter(car -> car.getStatus() == CarStatus.AVAILABLE)
                .collect(Collectors.toList());
    }

    public boolean bookCar(Car car) {
        if (car.getStatus() == CarStatus.AVAILABLE) {
            car.setStatus(CarStatus.BOOKED);
            return true;
        }
        return false;
    }
}
