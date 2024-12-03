package services;

import models.Car;
import java.util.ArrayList;
import java.util.List;

public class RentalManager {
    private List<Car> availableCars;

    public RentalManager() {
        availableCars = new ArrayList<>();
    }

    public void addCar(Car car) {
        availableCars.add(car);
        System.out.println("Car added successfully!");
    }

    public List<Car> getAvailableCars() {
        return availableCars;
    }
}
