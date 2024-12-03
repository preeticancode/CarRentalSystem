package models;

public final class SUV extends Car {
    private final boolean fourWheelDrive;

    public SUV(String name, String licensePlate, boolean fourWheelDrive) {
        super(name, licensePlate);
        this.fourWheelDrive = fourWheelDrive;
    }

    public boolean isFourWheelDrive() {
        return fourWheelDrive;
    }

    @Override
    public String toString() {
        return super.toString() + ", Four-Wheel Drive: " + fourWheelDrive;
    }
}
