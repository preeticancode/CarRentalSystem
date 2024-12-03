package utils;

import models.Car;
import models.Customer;

import java.time.LocalDate;

public final class RentalTransaction {
    private final Car car;
    private final Customer customer;
    private final LocalDate rentalDate;

    public RentalTransaction(Car car, Customer customer) {
        this.car = car;
        this.customer = customer;
        this.rentalDate = LocalDate.now();
    }

    public Car getCar() {
        return car;
    }

    public Customer getCustomer() {
        return customer;
    }

    public LocalDate getRentalDate() {
        return rentalDate;
    }

    @Override
    public String toString() {
        return "RentalTransaction{" +
                "car=" + car +
                ", customer=" + customer +
                ", rentalDate=" + rentalDate +
                '}';
    }
}
