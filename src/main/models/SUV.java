package models;

public final class SUV extends Car {
    private final boolean hasFourWheelDrive;

    public SUV(String model, String registration, double rentalRate, boolean hasFourWheelDrive) {
        super(model, registration, rentalRate);
        this.hasFourWheelDrive = hasFourWheelDrive;
    }

    public boolean hasFourWheelDrive() {
        return hasFourWheelDrive;
    }

    @Override
    public String toString() {
        return "SUV{" +
                "hasFourWheelDrive=" + hasFourWheelDrive +
                "} " + super.toString();
    }
}
