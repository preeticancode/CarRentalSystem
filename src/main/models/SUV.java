package models;

public class SUV extends Car {
    private boolean isFourWheelDrive;

    public SUV(String model, String registrationNumber, boolean isFourWheelDrive) {
        super(model, registrationNumber);
        this.isFourWheelDrive = isFourWheelDrive;
    }

    public boolean isFourWheelDrive() {
        return isFourWheelDrive;
    }

    @Override
    public String toString() {
        return super.toString() + ", Four-Wheel Drive: " + isFourWheelDrive;
    }
}
