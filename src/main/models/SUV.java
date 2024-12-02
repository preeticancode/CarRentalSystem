package models;

public final class SUV extends Car {
    private final boolean isFourWheelDrive;

    public SUV(String model, String licensePlate, boolean isFourWheelDrive) {
        super(model, licensePlate);
        this.isFourWheelDrive = isFourWheelDrive;
    }

    @Override
    public String toString() {
        return super.toString() + ", Four-Wheel Drive: " + isFourWheelDrive;
    }
}
