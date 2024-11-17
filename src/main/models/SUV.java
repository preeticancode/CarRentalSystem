package models;

public final class SUV extends Car {
    private boolean allWheelDrive;

    public SUV(String model, String licensePlate, boolean allWheelDrive) {
        super(model, licensePlate);
        this.allWheelDrive = allWheelDrive;
    }

    @Override
    public double calculateRentalPrice() {
        return allWheelDrive ? 100 : 75; // Example price based on AWD
    }
}
