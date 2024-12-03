package models;

import java.util.Collections;
import java.util.List;

public final class RentalHistory {
    private final String customerName;
    private final List<RentalDetails> rentalDetails;

    public RentalHistory(String customerName, List<RentalDetails> rentalDetails) {
        this.customerName = customerName;
        this.rentalDetails = Collections.unmodifiableList(rentalDetails);
    }

    public String getCustomerName() {
        return customerName;
    }

    public List<RentalDetails> getRentalDetails() {
        return rentalDetails;
    }
}
