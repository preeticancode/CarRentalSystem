package models;

import java.time.LocalDate;

public record RentalDetails(String customerName, LocalDate rentalDate, double amount) {
}
