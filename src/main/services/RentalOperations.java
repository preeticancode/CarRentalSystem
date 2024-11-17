package main.models.services;

public class RentalOperations {
    
}
package main.services;

import models.Car;

import java.util.List;

public interface RentalOperations {
    List<Car> getAvailableCars();

    default double calculateTotalPrice(Car car, int days) {
        return car.calculateRentalPrice(days);
    }

    static String formatInvoice(Car car, int days, double totalPrice) {
        return "Invoice: \nCar: " + car.getModel() + 
               "\nDays: " + days + 
               "\nTotal Price: $" + totalPrice;
    }
}
