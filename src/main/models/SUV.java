package models;

public class SUV extends Car {
    private boolean fourWheelDrive;

    public SUV(String name, String licensePlate, boolean fourWheelDrive) {
        super(name, licensePlate);
        this.fourWheelDrive = fourWheelDrive;
    }

    @Override
    public String toString() {
        return super.toString() + ", Four-Wheel Drive: " + fourWheelDrive;
    }
}
