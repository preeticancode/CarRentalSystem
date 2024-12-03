package services;

import models.Car;
import models.ElectricCar;
import models.SUV;

import java.util.ArrayList;
import java.util.List;

public class RentalManager implements RentalService {
    private final List<Car> availableCars = new ArrayList<>();

    @Override
    public void addCar(Car car) {
        availableCars.add(car);
    }

    public void showAvailableCars() {
        if (availableCars.isEmpty()) {
            System.out.println("No available cars.");
        } else {
            availableCars.forEach(System.out::println);
        }
    }

    public void showElectricCars() {
        availableCars.stream()
                .filter(car -> car instanceof ElectricCar)
                .forEach(System.out::println);
    }

    public void showSUVs() {
        availableCars.stream()
                .filter(car -> car instanceof SUV suv && suv.hasFourWheelDrive())
                .forEach(System.out::println);
    }
}
