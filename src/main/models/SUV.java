package main.models;

public class SUV {
    
}
package models;

public final class SUV extends Car {
    private boolean allWheelDrive;

    public SUV(String model, String registrationNumber, boolean allWheelDrive) {
        super(model, registrationNumber);
        this.allWheelDrive = allWheelDrive;
    }

    @Override
    public double calculateRentalPrice(int days) {
        return 70.0 * days; // Higher rate for SUVs
    }
}
